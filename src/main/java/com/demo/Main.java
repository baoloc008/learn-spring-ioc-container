package com.demo;

import com.demo.girlinterface.Outfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Girl girl = context.getBean(Girl.class); // Lấy Girl đã được tạo ra xem.
        System.out.println(girl);

        Girl girl2 = context.getBean(Girl.class);
        System.out.println(girl == girl2); // Kết quả ra False
        // Chứng tỏ mỗi lần lấy ra chúng ta tạo ra 1 Cô gái khác nhau => do @Scope("prototype")

        Outfit outfit = context.getBean(Outfit.class);
        System.out.println(outfit);
        Outfit outfit2 = context.getBean(Outfit.class);
        System.out.println(outfit == outfit2); // Kết quả ra True
        // Chứng tỏ Outfit là singleton.
    }
}
