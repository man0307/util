package com.mcy.util.collection.springcharacteristic;

import com.mcy.util.BaseTest;
import com.mcy.util.core.collection.springcharacteristic.ObtainBeanUtil;
import com.mcy.util.core.collection.springcharacteristic.example.AMTest;
import com.mcy.util.core.collection.springcharacteristic.example.MTest;
import com.mcy.util.core.collection.springcharacteristic.example.MTestAnnotation;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/2 8:08 下午
 * <p>
 * Bean获取的工具类
 */
public class ObtainBeanUtilMTest extends BaseTest {

    @Resource
    private ObtainBeanUtil obtainBeanUtil;

    @Test
    public void testGetGenericsType() {
        MTest mtest = obtainBeanUtil.getGenericsType(MTest.class, Integer.class);
        mtest.test();
    }

    @Test
    public void testGetBean() {
        obtainBeanUtil.getBean(AMTest.class).test();
    }

    @Test
    public void testGetBeansWithAnnotation() {
        List<Object> mTestList = obtainBeanUtil.getBeansWithAnnotation(MTestAnnotation.class);
    }

}
