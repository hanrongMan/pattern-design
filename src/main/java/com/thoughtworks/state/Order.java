package com.thoughtworks.state;

public class Order {
    private OrderState state;

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
