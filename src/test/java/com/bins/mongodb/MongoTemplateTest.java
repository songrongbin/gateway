package com.bins.mongodb;

import com.bins.mongodb.model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by songrongbin on 2016/10/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:gateway-context.xml")
public class MongoTemplateTest {
    @Autowired
    private MongoTemplate mongoTemplate;


    @Test
    public void test(){
        Customer c = new Customer();
        c.setFirstName("wu3");
        c.setLastName("wei4");
        mongoTemplate.insert(c);
    }
}
