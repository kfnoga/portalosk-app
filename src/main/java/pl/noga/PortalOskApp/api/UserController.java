package pl.noga.PortalOskApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.noga.PortalOskApp.dao.entity.User;
import pl.noga.PortalOskApp.manager.UserManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserManager users;

    @Autowired
    public UserController(UserManager users) {
        this.users = users;
    }

    @GetMapping("/all")
    public Iterable<User> getAll(){
        return users.findAll();
    }

    @GetMapping
    public Optional<User> getById(@RequestParam Long id){
        return users.findById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return users.add(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return users.add(user);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id){
        users.delete(id);
    }

}
