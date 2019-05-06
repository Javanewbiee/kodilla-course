package com.kodilla.good.patterns.food2doorchallange;

public class NewProducer {

    private String producerName;
    private String productType;
    private String emailContact;

    public NewProducer(String producerName, String productType, String emailContact) {
        this.producerName = producerName;
        this.productType = productType;
        this.emailContact = emailContact;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProductType() {
        return productType;
    }

    public String getEmailContact() {
        return emailContact;
    }
}
