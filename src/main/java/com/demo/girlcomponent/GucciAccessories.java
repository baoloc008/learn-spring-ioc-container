package com.demo.girlcomponent;

import com.demo.girlinterface.Accessories;
import org.springframework.stereotype.Component;

// Phụ kiện Gucci nhờ :3
@Component
public class GucciAccessories implements Accessories {
    // Class chỉ mang tính minh họa, không có gì cả

    @Override
    public String toString() {
        return "GucciAccessories";
    }
}
