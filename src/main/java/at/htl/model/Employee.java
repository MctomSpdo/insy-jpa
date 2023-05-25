package at.htl.model;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {
    private double sarary;

    public double getSarary() {
        return sarary;
    }

    public void setSarary(double sarary) {
        this.sarary = sarary;
    }
}
