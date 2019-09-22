package eu.flate.glc.api.auth.repository;

import eu.flate.glc.api.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository
    extends JpaRepository<Role, Long> {
}
