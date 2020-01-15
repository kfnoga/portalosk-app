package pl.noga.PortalOskApp.dao.entity;

import pl.noga.PortalOskApp.dao.helper.RoleName;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private RoleName name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role() {
    }
    public Role(Long id, RoleName name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getName() {
        return name;
    }

    public void setName(RoleName name) {
        this.name = name;
    }


}
