package at.htl.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Customer extends Person {
    private int rating;

    @OneToMany(mappedBy = "customer")
    //@JoinColumn(name = "cust_id")
    private List<Order> orders;


    public Customer() {

    }

    public Customer(String firstname, String lastname, LocalDate dob, int rating) {
        super(firstname, lastname, dob);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
