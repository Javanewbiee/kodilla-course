package com.kodilla.good.patterns.food2doorchallange;

public class EmailOrderInforamtionSender implements OrderInformationSender {

    public void inform(CompleteOrder completeOrder) {
        String prodInfo = completeOrder.getOrder().getTypeOfProduct();
        int quantInfo = completeOrder.getOrder().getProductQuantity();
        String producerInfo = completeOrder.getOrder().getProducerName();

        System.out.println("You have ordered " + prodInfo + " in quantity of " + quantInfo + " from " + producerInfo);
    }
}
