package eu.flate.glc.api.auth.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "roles")
@Data
public class Role
    implements Serializable {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(generator = "role_generator")
    @TableGenerator(
        name = "role_generator",
        table = "generators",
        pkColumnName = "sequence_name",
        pkColumnValue = "roleIds",
        initialValue = 1000,
        allocationSize = 13,
        valueColumnName = "last_generated"
    )
    private long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}
