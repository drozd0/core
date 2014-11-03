package ru.qlogistic.logic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User implements Serializable{
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "sender_id")
    private Set<Order> sendOrders;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "receiver_id")
    private Set<Order> recOrders;

    public Set<Order> getSendOrders() {
        return sendOrders;
    }

    public void setSendOrders(Set<Order> sendOrders) {
        this.sendOrders = sendOrders;
    }

    public Set<Order> getRecOrders() {
        return recOrders;
    }

    public void setRecOrders(Set<Order> recOrders) {
        this.recOrders = recOrders;
    }
}
