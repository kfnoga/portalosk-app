package pl.noga.PortalOskApp.dao.entity;

import pl.noga.PortalOskApp.dao.helper.CourseType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private CourseType type;

    private double price;

    private double discount;

    private double payment;


}
