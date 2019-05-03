package com.kodilla.good.patterns.challenges;

public class ProductOrderService {


    public void process( Order order){
        if(order.getItem().getItemType()== "Game"){
            GameDataBaseSend gameDataBaseSend = new GameDataBaseSend();
            gameDataBaseSend.send(order);
            System.out.println("Order sent to database");
        }else if(order.getItem().getItemType()=="Book"){
            BookDataBaseSend bookDataBaseSend = new BookDataBaseSend();
            bookDataBaseSend.send(order);
            System.out.println("Order sent to database");
        }else if(order.getItem().getItemType()=="Slippers"){
            SlippersDataBaseSend slippersDataBaseSend = new SlippersDataBaseSend();
            slippersDataBaseSend.send(order);
            System.out.println("Order sent to database");
        }
        if(order.getInfo()== "mail"){
            SendMail sendMail = new SendMail();
            sendMail.inform(order);
        }else{
            SendSMS sendSMS = new SendSMS();
            sendSMS.inform(order.getUser().getPhoneNumber());
        }
    }
}
