package pl.noga.PortalOskApp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.noga.PortalOskApp.dao.entity.User;

public interface UserRepo extends CrudRepository<User, Long> {
}
