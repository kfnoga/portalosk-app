package pl.noga.PortalOskApp.dao.entity;

import pl.noga.PortalOskApp.dao.helper.CourseType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private CourseType type;

    private double price;

    private double discount;

    private double payment;

    @ManyToMany(mappedBy = "courses")
    private List<User> users;

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Course(Long id, CourseType type, double price, double discount, double payment) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.payment = payment;
    }
}
