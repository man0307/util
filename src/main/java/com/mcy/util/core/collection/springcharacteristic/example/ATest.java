package com.mcy.util.core.collection.springcharacteristic.example;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/2 8:11 下午
 */
public class ATest implements Test<Integer> {

    @Override
    public void test(Integer code) {
        System.out.println("Integer");
    }

}
