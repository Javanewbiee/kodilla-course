package com.kodilla.patterns3.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Component
public class ShopService {

    private final List<Order>orders = new ArrayList<>();
    @Autowired
    private Authenticator authenticator;
    @Autowired
    private ProductService productService;

    public Long openOrder(Long userId) {
        if (authenticator.isAutenticated(userId)) {
            Long maxOrder = (long)orders.stream()
                    .mapToInt(o->o.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(productService, maxOrder +1, userId));
            return maxOrder +1;
        }else {
            return -1L;
        }
    }
    public void addItem(Long orderId, Long productId, double qty) {
        orders.stream()
                .filter(o->o.getOrderId().equals(orderId))
                .forEach(o->o.getItems().add(new Item(productId, qty)));
    }
    public boolean removeItem(Long orderId, Long productId) {
        Iterator<Order>orderIterator = orders.stream()
                .filter(o->o.getOrderId().equals(orderId))
                .iterator();
        while(orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            int orderSize = theOrder.getItems().size();
            for (int n = 0; n<theOrder.getItems().size(); n++ ) {
                if (theOrder.getItems().get(n).getProductId().equals(productId)) {
                    theOrder.getItems().remove(n);
                    return true;
                }
            }
        }
        return false;
    }
    public BigDecimal calculateValue(Long orderId) {
        Iterator<Order>orderIterator = orders.stream()
                .filter(o->o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            return theOrder.calculateValue();
        }
        return BigDecimal.ZERO;
    }
    public boolean doPayment(Long orderId) {
        Iterator<Order>orderIterator = orders.stream()
                .filter(o->o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isPaid()) {
                return true;
            }else {
                Random gen = new Random();
                theOrder.setPaid(gen.nextBoolean());
                return theOrder.isPaid();
            }
        }
        return false;
    }
    public boolean verifyOrder(Long orderId) {
        Iterator<Order>orderIterator = orders.stream()
                .filter(o->o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            boolean result = theOrder.isPaid();
            Random gen = new Random();
            if (!theOrder.isVerified()) {
                theOrder.setVerified(result && gen.nextBoolean());
            }
            return theOrder.isVerified();
        }
        return false;
    }
    public boolean submitOrder(Long orderId) {
        Iterator<Order>orderIterator = orders.stream()
                .filter(o->o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isVerified()) {
                theOrder.setSubmitted(true);
            }
            return theOrder.isSubmitted();
        }
        return false;
    }
    public void cancelOrder(Long orderId) {
        Iterator<Order>orderIterator = orders.stream()
                .filter(o->o.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            orders.remove(theOrder);
        }
    }
}
