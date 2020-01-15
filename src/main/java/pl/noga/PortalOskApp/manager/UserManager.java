package pl.noga.PortalOskApp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.noga.PortalOskApp.dao.UserRepo;
import pl.noga.PortalOskApp.dao.entity.User;

import java.util.Optional;

@Service
public class UserManager {

    private UserRepo userRepo;

    @Autowired
    public UserManager(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Iterable<User>findAll(){
        return userRepo.findAll();
    }

    public Optional<User>findById(Long id){
        return userRepo.findById(id);
    }
    public User add(User user){
        return userRepo.save(user);
    }
    public void delete(Long id){
        userRepo.deleteById(id);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        add(new User(1L,"user@test.com"));
    }
}
