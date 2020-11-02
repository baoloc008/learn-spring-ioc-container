package com.demo.girlcomponent;

import com.demo.girlinterface.HairStyle;
import org.springframework.stereotype.Component;

// Tóc hàn quốc cho xinh
@Component
public class KoreanHairStyle implements HairStyle {
    // Class chỉ mang tính minh họa, không có gì cả

    @Override
    public String toString() {
        return "KoreanHairStyle";
    }
}
