package com.kodilla.good.patterns.food2doorchallange;

public class CompleteOrder {

    private User user;
    private Order order;

    public CompleteOrder(User user, Order order) {
        this.user = user;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }
}
