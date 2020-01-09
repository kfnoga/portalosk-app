package pl.noga.PortalOskApp.dao.entity;

import pl.noga.PortalOskApp.dao.helper.RoleName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private RoleName name;

    public Role() {
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

    public Role(Long id, RoleName name) {
        this.id = id;
        this.name = name;
    }
}
