package thelook.testmb4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tangfanghua
 */
@SpringBootApplication
public class App {

    public static void main(String[] argv) {
        SpringApplication.run(App.class, argv);
    }

    @Bean
    CommandLineRunner cmd(AddressRepository addressRepo) {
        return (argv) -> {
            final long i = addressRepo.count();
            Address a = new Address();
            a.setName("你👌📖");
            a.setUserId(2);
            a.setMobile("18811112222");
            a.setProvince("sa");
            a.setCity("city");
            a.setArea("area");
            a.setDetail("de");
            addressRepo.save(a);
            System.out.println("i:" + i);
        };
    }
}
