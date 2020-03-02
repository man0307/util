package com.mcy.util.collection.list;

import com.mcy.util.core.collection.list.ListConvertUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/2 4:30 下午
 */
public class ListConvertUtilMTest {
    private List<Integer> testList;

    @Test
    public void testConvertListByFunction() {
        List<String> convertedList = ListConvertUtil.convertListByFunction(testList, Object::toString);
        convertedList.forEach(item -> Assertions.assertEquals(String.class.getName(), item.getClass().getName()));
    }

    @Before
    public void buildList() {
        testList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testList.add(i);
        }
    }
}
