package com.kodilla.good.patterns.food2doorchallange;

public class ExtraFoodShop implements Producers {

    public OrderDto process(CompleteOrder completeOrder) {
        if(completeOrder.getOrder().getProducerName() == "ExtraFoodShop") {
            OrderToProducesSender efs = new ExtraFoodShopOrderToProducerSender();
            efs.send(completeOrder);
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
