package org.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class PersonsTest {
    @Autowired
    private CustomerRepository customerRepository;
    @Test
    public void createCustomer(){
        Customer customer = new Customer();
        customer = customerRepository.save(customer);
        System.out.println(customer.toString());
        assertEquals(customer.getFirstName(),"John");
        assertNull(customer.getPhoneNumber()!=null);
    }

}
