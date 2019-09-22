package eu.flate.glc.api.auth.service;

import eu.flate.glc.api.auth.model.Role;
import eu.flate.glc.api.auth.model.User;
import eu.flate.glc.api.auth.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl
    implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(final UserRepository userRepository) {this.userRepository = userRepository;}

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(final String username)
        throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) { throw new UsernameNotFoundException(username); }

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : user.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                                                                      grantedAuthorities);
    }
}
