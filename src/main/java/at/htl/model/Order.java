package at.htl.model;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    private Long orderId;

    private int status;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    //<editor-fold desc="Getter and Setter">
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //</editor-fold>
}
