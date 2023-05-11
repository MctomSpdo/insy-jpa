package at.htl;

import at.htl.model.Person;

import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("myPU");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

        var p1 = new Person("Max", "Muster", LocalDate.of(2000, 1, 1));
        p1 = em.merge(p1);
        p1.setLastname("Mustermann");

        em.getTransaction().commit();

        em.getTransaction().begin();
        var p2 = em.find(Person.class, 1000L);
        em.remove(p2);
        em.getTransaction().commit();

        System.out.println(p2.getFirstname());

        em.close();
        emf.close();
    }
}