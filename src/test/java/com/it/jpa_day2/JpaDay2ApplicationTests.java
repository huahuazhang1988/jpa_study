package com.it.jpa_day2;

import com.it.jpa_day2.dao.CustomerDao;
import com.it.jpa_day2.domain.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JpaDay2ApplicationTests {
    @Autowired
    private CustomerDao customerDao;


    @Test
    void testFindOne() {
      // Customer customer= customerDao.getById(2l);
        Customer one = customerDao.getOne(2l);
        System.out.println(one);
    }
    @Test
    void testSave() {

        Customer customer = new Customer();
        customer.setCustName("alax");
        customer.setCustAddress("erfurt");
        customerDao.save(customer);
    }

}
