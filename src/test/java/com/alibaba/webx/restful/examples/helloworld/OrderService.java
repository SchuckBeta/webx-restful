package com.alibaba.webx.restful.examples.helloworld;

public class OrderService {

    public Order findOrder(int id) {
        Order order = new Order();
        
        order.setId(id);
        order.setName("name_" + id);
        
        return order;
    }
    
    public Order findOrder(int id, String name) {
        Order order = new Order();
        
        order.setId(id);
        order.setName(name);
        
        return order;
    }
}
