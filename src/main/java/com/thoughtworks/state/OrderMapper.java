package com.thoughtworks.state;

public interface OrderMapper {
    Order save(Order order);

    Order select(int id);
}
