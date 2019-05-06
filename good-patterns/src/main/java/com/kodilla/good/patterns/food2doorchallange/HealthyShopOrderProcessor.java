package com.kodilla.good.patterns.food2doorchallange;

public class HealthyShopOrderProcessor implements ProducersOrderProcessor {

    public void process(CompleteOrder completeOrder) {
        if (completeOrder.getOrder().getProducerName() == "HealthyShop") {
            OrderToProducesSender efs = new ExtraFoodShopOrderToProducerSender();
            efs.send(completeOrder.getOrder());
            OrderDataBaseSender send = new OrderDataBaseSender();
            send.send(completeOrder);
            OrderInformationSender info = new EmailOrderInforamtionSender();
            info.inform(completeOrder);
        }
    }
}
