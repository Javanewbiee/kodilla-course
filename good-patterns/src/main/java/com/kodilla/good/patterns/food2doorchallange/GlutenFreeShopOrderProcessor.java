package com.kodilla.good.patterns.food2doorchallange;

public class GlutenFreeShopOrderProcessor implements ProducersOrderProcessor {

    private GlutenFreeShopStock glutenFreeShopStockLion = new GlutenFreeShopStockLion();

    public void process(CompleteOrder completeOrder) {
        if (completeOrder.getOrder().getProducerName() == "GlutenFreeShop" && glutenFreeShopStockLion.getStock() >= completeOrder.getOrder().getProductQuantity()) {
            OrderToProducesSender gfs = new GlutenFreeShopOrderToProducerSender();
            gfs.send(completeOrder.getOrder());
            OrderDataBaseSender send = new OrderDataBaseSender();
            send.send(completeOrder);
            OrderInformationSender info = new EmailOrderInforamtionSender();
            info.inform(completeOrder);
        }
    }
}
