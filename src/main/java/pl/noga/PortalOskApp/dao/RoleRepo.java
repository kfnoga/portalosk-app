package pl.noga.PortalOskApp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.noga.PortalOskApp.dao.entity.Role;

public interface RoleRepo extends CrudRepository<Role, Long> {
}
