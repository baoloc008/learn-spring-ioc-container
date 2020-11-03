package com.demo;

import com.demo.girlinterface.Accessories;
import com.demo.girlinterface.HairStyle;
import com.demo.girlinterface.Outfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Girl {
    private final Outfit outfit;
    private final Accessories accessories;
    private final HairStyle hairStyle;

    @Autowired
    public Girl(Outfit outfit, Accessories accessories, HairStyle hairStyle) {
        this.outfit = outfit;
        this.accessories = accessories;
        this.hairStyle = hairStyle;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "outfit=" + outfit +
                ", accessories=" + accessories +
                ", hairStyle=" + hairStyle +
                '}';
    }
}
