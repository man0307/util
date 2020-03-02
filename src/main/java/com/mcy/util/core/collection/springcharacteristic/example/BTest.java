package com.mcy.util.core.collection.springcharacteristic.example;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/2 8:11 下午
 */
public class BTest implements Test<String> {

    @Override
    public void test(String s) {
        System.out.println("String");
    }
}
