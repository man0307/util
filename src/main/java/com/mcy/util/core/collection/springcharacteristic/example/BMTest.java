package com.mcy.util.core.collection.springcharacteristic.example;

import org.springframework.stereotype.Component;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/2 8:11 下午
 */
@Component
public class BMTest implements MTest<String> {

    @Override
    public void test(String s) {
        System.out.println("String");
    }
}
