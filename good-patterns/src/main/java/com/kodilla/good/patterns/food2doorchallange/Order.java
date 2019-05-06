package com.kodilla.good.patterns.food2doorchallange;

public class Order {

    private String producerName;
    private String typeOfProduct;
    private int productQuantity;
    private String preferedContact;

    public Order(String producerName, String typeOfProduct, int productQuantity, String preferedContact) {
        this.producerName = producerName;
        this.typeOfProduct = typeOfProduct;
        this.productQuantity = productQuantity;
        this.preferedContact = preferedContact;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getPreferedContact() {
        return preferedContact;
    }
}
