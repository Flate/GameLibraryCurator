package eu.flate.glc.api.auth.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;

@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
@Data
@Entity
public class User
    implements Serializable {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(generator = "user_generator")
    @TableGenerator(
        name = "user_generator",
        table = "generators",
        pkColumnName = "sequence_name",
        pkColumnValue = "userIds",
        initialValue = 1000,
        allocationSize = 13,
        valueColumnName = "last_generated"
    )
    private long id;

    @ManyToMany
    private Set<Role> roles;

    @NotBlank
    @Column(name = "username", nullable = false)
    private String username;

    private String firstName;

    private String lastName;

    private LocalDate birthDay;

    @Column(name = "password_hash", nullable = false)
    private String password;

    @Transient
    private String passwordConfirm;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Instant modifiedAt;

    @Column(name = "last_login")
    private Instant lastLogin;

}
