package com.mcy.util.core.collection.springcharacteristic.example;

import org.springframework.stereotype.Component;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/2 8:11 下午
 */
@Component
public class AMTest implements MTest<Integer> {

    @Override
    public void test(Integer code) {
        System.out.println("Integer");
    }

}
