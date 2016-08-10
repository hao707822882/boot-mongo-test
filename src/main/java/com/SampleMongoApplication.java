package com;

/**
 * Created by Administrator on 2016/8/7.
 */

import com.dao.UserDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class SampleMongoApplication implements CommandLineRunner {

    @Autowired
    private UserDao repository;

    @Override
    public void run(String... args) throws Exception {
//        this.repository.deleteAll();
//
//        User child = new User("child", "child");
//        User user = new User("Alice", "Smith");
//        user.setChild(child);
//        // save a couple of customers
//        this.repository.save(user);
//        this.repository.save(new User("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");


        ExecutorService executorService = Executors.newCachedThreadPool();

        User user = repository.findByChildName("zhumingmning");
        System.out.println(user);
//        for (User customer : this.repository.findAll()) {
//            System.out.println(customer);
//            User child1 = customer.getChild();
//            if (child1 != null) {
//                child1.setFirstName("zhumingmning");
//                child1.setLastName("---------");
//                User save = repository.save(customer);
//            }
//        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleMongoApplication.class, args);
    }

}