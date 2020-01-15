package pl.noga.PortalOskApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.noga.PortalOskApp.dao.entity.Course;
import pl.noga.PortalOskApp.manager.CourseManager;

import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private CourseManager courses;

    @Autowired
    public CourseController(CourseManager courses) {
        this.courses = courses;
    }

    @GetMapping("/all")
    public Iterable<Course> getAll() {
        return courses.findAll();
    }

    @GetMapping
    public Optional<Course> getById(@RequestParam Long index){
        return courses.findById(index);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return courses.add(course);
    }

    @PutMapping
    public Course updateCourse(@RequestBody Course course){
        return courses.add(course);
    }
    @DeleteMapping
    public void deleteCourse(@RequestParam Long index ){
        courses.deleteById(index);
    }
}
