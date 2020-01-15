package pl.noga.PortalOskApp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.noga.PortalOskApp.dao.entity.Course;

public interface CourseRepo extends CrudRepository<Course,Long> {
}
