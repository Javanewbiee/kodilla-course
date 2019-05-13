package com.kodilla.good.patterns.food2doorchallange;

public class GlutenFreeShop implements Producers {

    private GlutenFreeShopStock glutenFreeShopStockLion = new GlutenFreeShopStockLion();

    public OrderDto process(CompleteOrder completeOrder) {
        if (completeOrder.getOrder().getProducerName() == "GlutenFreeShop" && glutenFreeShopStockLion.getStock() >= completeOrder.getOrder().getProductQuantity()) {
            OrderToProducesSender gfs = new GlutenFreeShopOrderToProducerSender();
            gfs.send(completeOrder);
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
