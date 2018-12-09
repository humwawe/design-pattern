package design.pattern.structural.proxy.dynamic_level;

import design.pattern.structural.proxy.IOrderService;
import design.pattern.structural.proxy.Order;
import design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author hum
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
