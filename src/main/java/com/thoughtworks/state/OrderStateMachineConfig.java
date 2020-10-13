package com.thoughtworks.state;

import org.springframework.statemachine.StateMachineContext;
import org.springframework.statemachine.StateMachinePersist;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.persist.DefaultStateMachinePersister;
import org.springframework.statemachine.persist.StateMachinePersister;
import org.springframework.statemachine.support.DefaultStateMachineContext;

import java.util.EnumSet;

/**
 * 订单状态机配置
 * 
 * @author sunbufu
 */
//@Configuration
@EnableStateMachine(name = "orderStateMachine")
public class OrderStateMachineConfig extends EnumStateMachineConfigurerAdapter<OrderState, OrderEvent> {

    @Override
    public void configure(StateMachineStateConfigurer<OrderState, OrderEvent> states) throws Exception {
        states.withStates()
            // 默认状态
            .initial(OrderState.WAIT_PAYMENT)
            // 全部状态
            .states(EnumSet.allOf(OrderState.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<OrderState, OrderEvent> transitions) throws Exception {
        transitions.withExternal()
            // 支付事件 待支付 -> 待发货
            .source(OrderState.WAIT_PAYMENT).target(OrderState.WAIT_DELIVER).event(OrderEvent.PAYED).action(payAction())
            // 发货事件 待发货 -> 待收货
            .and().withExternal().source(OrderState.WAIT_DELIVER).target(OrderState.WAIT_RECEIVE).event(OrderEvent.DELIVERY).action(deliveryAction())
            // 收货事件 待收货 -> 完结
            .and().withExternal().source(OrderState.WAIT_RECEIVE).target(OrderState.FINISH).event(OrderEvent.RECEIVED).action(receivedAction());
    }



    private Action<OrderState, OrderEvent> payAction() {
        return context -> System.out.println("已支付");
    }

    private Action<OrderState, OrderEvent> deliveryAction() {
        return context -> System.out.println("已发货");
    }

    private Action<OrderState, OrderEvent> receivedAction() {
        return context -> System.out.println("已收获");
    }


}