package com.kodilla.good.patterns.food2doorchallange;

public class HealthyShop implements Producers {

    public OrderDto process(CompleteOrder completeOrder) {
        if (completeOrder.getOrder().getProducerName() == "HealthyShop") {
            OrderToProducesSender hs = new ExtraFoodShopOrderToProducerSender();
            hs.send(completeOrder);
            OrderDataBaseSender send = new OrderDataBaseSender();
            send.send(completeOrder);
            OrderInformationSender info = new EmailOrderInforamtionSender();
            info.inform(completeOrder);
            return new OrderDto(completeOrder.getUser(), true);
        }else {
            return new OrderDto(completeOrder.getUser(), false);
        }
    }
}
