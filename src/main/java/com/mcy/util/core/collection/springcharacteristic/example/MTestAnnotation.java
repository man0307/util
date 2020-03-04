package com.mcy.util.core.collection.springcharacteristic.example;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/3 9:37 下午
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
public @interface MTestAnnotation {

}
