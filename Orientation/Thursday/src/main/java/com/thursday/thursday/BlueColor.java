package com.thursday.thursday;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor {
    @Override
    public String printColor() {
        return "It is blue in color.";
    }
}
