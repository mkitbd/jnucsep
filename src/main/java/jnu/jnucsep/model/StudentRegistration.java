package jnu.jnucsep.model;

import javax.persistence.*;

@Entity
@Table(name = "student_registration")
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "batch")
    private String batch;

    @Column(name = "section")
    private String section;

    @Column(name = "roll")
    private String roll;

    @Column(name = "email")
    private String email;

}
