package ru.qlogistic.logic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@DiscriminatorValue("courier")
public class Courier extends User implements Serializable {
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "courier_id")
    private Set<Order> orders;

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
