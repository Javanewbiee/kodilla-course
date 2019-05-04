package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private Information information;
    private DataBaseSend dataBaseSend;

    public ProductOrderService(Information information, DataBaseSend dataBaseSend) {
        this.information = information;
        this.dataBaseSend = dataBaseSend;
    }

    public void process(OrderedItem order){
        information.inform(order);
        dataBaseSend.send(order);


    }
}
