package pl.noga.PortalOskApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.noga.PortalOskApp.dao.entity.Role;
import pl.noga.PortalOskApp.manager.RoleManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private RoleManager roles;

    @Autowired
    public RoleController(RoleManager roles) {
        this.roles = roles;
    }

    @GetMapping("/all")
    public Iterable<Role>getAll(){
        return roles.findAll();
    }

    @GetMapping
    public Optional<Role>findById(@RequestParam Long id){
        return roles.findById(id);
    }

    @PostMapping
    public Role addRole(@RequestBody Role role){
        return roles.add(role);
    }
    @PutMapping
    public Role updateRole(@RequestBody Role role){
        return roles.add(role);
    }
    @DeleteMapping
    public void deleteRole(@RequestParam Long id){
        roles.deleteById(id);
    }
}
