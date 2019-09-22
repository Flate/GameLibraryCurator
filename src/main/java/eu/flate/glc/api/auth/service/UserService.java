package eu.flate.glc.api.auth.service;

import eu.flate.glc.api.auth.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
