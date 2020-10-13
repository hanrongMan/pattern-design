package com.thoughtworks.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.persist.StateMachinePersister;

/**
 * 订单服务
 *
 * 待支付 -> 待发货 -> 待收货 -> 完结
 *
 * @author sunbufu
 */
//@Service
public class OrderService {

    @Autowired
    private StateMachine<OrderState, OrderEvent> orderStateMachine;

    @Autowired
    private StateMachinePersister<OrderState, OrderEvent, Order> orderStateMachinePersister;

    @Autowired
    private OrderMapper orderMapper;

    public Order create() {
        Order order = new Order();
        order.setState(OrderState.WAIT_PAYMENT);
        return orderMapper.save(order);
    }

    public Order pay(int id) {
        Order order = orderMapper.select(id);
        if (!sendEvent(OrderEvent.PAYED, order)) {
            throw new RuntimeException(" 等待支付 -> 等待发货 失败, 状态异常 order=" + order);
        }
        return order;
    }

    public Order deliver(int id) {
        Order order = orderMapper.select(id);
        if (!sendEvent(OrderEvent.DELIVERY, order)) {
            throw new RuntimeException(" 等待发货 -> 等待收货 失败，状态异常 order=" + order);
        }
        return order;
    }

    public Order receive(int id) {
        Order order = orderMapper.select(id);
        if (!sendEvent(OrderEvent.RECEIVED, order)) {
            throw new RuntimeException(" 等待收货 -> 完成 失败，状态异常 order=" + order);
        }
        return order;
    }

    /**
     * 发送订单状态转换事件
     *
     * @param event 事件
     * @param order 订单
     * @return 执行结果
     */
    private boolean sendEvent(OrderEvent event, Order order) {
        boolean result = false;
        try {
            orderStateMachine.start();
            // 设置状态机状态
            result = orderStateMachine.sendEvent(MessageBuilder.withPayload(event).setHeader("order", order).build());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            orderStateMachine.stop();
        }
        return result;
    }
}