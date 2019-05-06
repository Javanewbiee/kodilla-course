package com.kodilla.good.patterns.food2doorchallange;

public class ExtraFoodShopOrderProcessor implements ProducersOrderProcessor {

    public void process(CompleteOrder completeOrder) {

            OrderToProducesSender efs = new ExtraFoodShopOrderToProducerSender();
            efs.send(completeOrder.getOrder());
            OrderDataBaseSender send = new OrderDataBaseSender();
            send.send(completeOrder);
            OrderInformationSender info = new EmailOrderInforamtionSender();
            info.inform(completeOrder);
    }
}
