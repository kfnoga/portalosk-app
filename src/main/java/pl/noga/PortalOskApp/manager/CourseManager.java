package pl.noga.PortalOskApp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.noga.PortalOskApp.dao.CourseRepo;
import pl.noga.PortalOskApp.dao.entity.Course;
import pl.noga.PortalOskApp.dao.helper.CourseType;

import java.util.Optional;

@Service
public class CourseManager {
    private CourseRepo courseRepo;

    @Autowired
    public CourseManager(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }



    public Iterable<Course>findAll(){
        return courseRepo.findAll();
    }

    public Optional<Course> findById(Long id){
        return courseRepo.findById(id);
    }

    public Course add(Course course){
        return courseRepo.save(course);
    }

    public void deleteById(Long id){
        courseRepo.deleteById(id);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        add(new Course(1L, CourseType.B,1800,0,1800));
        add(new Course(2L, CourseType.C,3000,0,0));
    }
}
