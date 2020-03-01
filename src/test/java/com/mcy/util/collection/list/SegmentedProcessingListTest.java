package com.mcy.util.collection.list;

import com.mcy.util.core.collection.list.SegmentedProcessingList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/1 6:24 下午
 */
public class SegmentedProcessingListTest {

    private List<Integer> testList;

    @Test
    public void testSegmentedProcessing() {
        SegmentedProcessingList.segmentedProcessing(testList, 23, list -> System.out.println(list.size()));
    }


    @Before
    public void buildList() {
        testList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testList.add(i);
        }
    }

}
