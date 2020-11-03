package com.demo;

import com.demo.girlcomponent.Naked;
import com.demo.girlinterface.Outfit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // Đánh dấu một Class là Config, class này sẽ được ưu tiên tìm kiếm
public class GirlConfig {


    // Hiện tại container sẽ có 2 đối tượng có kiểu Outfit, cần chỉ định cho container biết sẽ dùng đối tượng nào

    // Cách 1: dùng @Primary


    // Cách 2: dùng @Bean("naked"), @Qualifier("naked")
    // @Bean("naked")
    @Bean // Gắn đối tượng Outfit trả về trong hàm này là 1 bean. IoC Container sẽ quản lý nó giống @Component luôn
    @Primary
    public Outfit defaultOutfit() {
        return new Naked(); // function này trả về một đối tượng Naked()
    }
}
