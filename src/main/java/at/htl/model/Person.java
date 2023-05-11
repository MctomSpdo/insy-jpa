package at.htl.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "person_seq_gen", sequenceName = "person_seq", initialValue = 1000)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "person_seq_gen")
    private Long id;

    private String firstname, lastname;
    private LocalDate dob;

    public Person() {
    }

    public Person(String firstname, String lastname, LocalDate dob) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
    }

    //region getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    //endregion
}
