package com.zkdlu.tdd;

import com.zkdlu.tdd.domain.shop.Shop;
import com.zkdlu.tdd.domain.shop.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(TddApplication.class, args);
    }

    @Autowired
    ShopRepository shopRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        shopRepository.save(new Shop("id", "건", 1000));
    }
}
