package pl.noga.PortalOskApp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.noga.PortalOskApp.dao.RoleRepo;

import pl.noga.PortalOskApp.dao.entity.Role;
import pl.noga.PortalOskApp.dao.helper.RoleName;


import java.util.Optional;

@Service
public class RoleManager {
    private RoleRepo roleRepo;

    @Autowired
    public RoleManager(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    @GetMapping("/all")
    public Iterable<Role>findAll(){
        return roleRepo.findAll();
    }
    @GetMapping
    public Optional<Role>findById(Long id){
        return roleRepo.findById(id);
    }
    @PostMapping
    public Role add(Role role){
        return roleRepo.save(role);
    }
    @DeleteMapping
    public void deleteById(Long id){
        roleRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        add(new Role(1L, RoleName.Instruktor));
        add(new Role(2L,RoleName.Administrator));
    }

}
