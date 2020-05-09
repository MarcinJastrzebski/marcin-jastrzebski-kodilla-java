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

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Transactional
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Ogorek");
        Product product2 = new Product("Pomidor");
        productDao.save(product1);
        productDao.save(product2);
        Item item = new Item(product1, new BigDecimal(10), 10, new BigDecimal(10));
        Item item2 = new Item(product2, new BigDecimal(20), 20, new BigDecimal(20));
        product1.getItems().add(item);
        product2.getItems().add(item2);
        itemDao.save(item);
        itemDao.save(item2);
        Invoice invoice1 = new Invoice("0001");
        invoice1.getItems().add(item);
        invoice1.getItems().add(item2);
        item.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        //When

        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteById(id);
    }
}
