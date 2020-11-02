package com.demo.girlcomponent;

import com.demo.girlinterface.Outfit;
import org.springframework.stereotype.Component;

@Component
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Đã mặc Bikini");
    }

    @Override
    public String toString() {
        return "Bikini";
    }
}
