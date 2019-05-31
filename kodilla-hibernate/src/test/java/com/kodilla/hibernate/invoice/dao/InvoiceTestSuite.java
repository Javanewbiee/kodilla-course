package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Keyboard");
        Product product1 = new Product("Headphones");
        Product product2 = new Product("Mouse");
        Product product3 = new Product("Paper");
        Product product4 = new Product("Toner Black");
        Product product5 = new Product("Toner Colour");

        Item item = new Item(new BigDecimal(120), 10, new BigDecimal(50));
        Item item1 = new Item(new BigDecimal(30), 300, new BigDecimal(10));

        item.getProduct().add(product);
        item.getProduct().add(product1);
        item.getProduct().add(product2);
        item1.getProduct().add(product3);
        item1.getProduct().add(product4);
        item1.getProduct().add(product5);

        product.setItem(item);
        product1.setItem(item);
        product2.setItem(item);
        product3.setItem(item1);
        product4.setItem(item1);
        product5.setItem(item1);


        Invoice invoice = new Invoice("Invoice 12/56/23");

        invoice.getItems().add(item);
        invoice.getItems().add(item1);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
