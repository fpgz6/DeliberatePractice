package com.simon.datastructure.heap;

import com.simon.algorithm.sort.SortUtils;
import org.junit.Test;

/**
 * HeapTest
 * Created by simon on 17-6-21.
 */
public class HeapTest {

    @Test
    public void testInsertExtractMax() {
        MaxHeap maxHeap = new MaxHeap();
        int[] randomArray = SortUtils.createRandomArray(10);
        SortUtils.printArray(randomArray);
        for (int i : randomArray) {
            maxHeap.insertData(i);
        }
        maxHeap.print();
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.extractMax());
        }
    }

    @Test
    public void testHeapify() {
        int[] randomArray = SortUtils.createRandomArray(10);
        SortUtils.printArray(randomArray);
        MaxHeap maxHeap = new MaxHeap(randomArray);
        maxHeap.print();
    }

    @Test
    public void testIndexMaxHeap() {
        IndexMaxHeap maxHeap = new IndexMaxHeap();
        int[] randomArray = {5,2,7,9,4,3,4,1};
        SortUtils.printArray(randomArray);
        for (int i : randomArray) {
            maxHeap.insertData(i);
        }
        maxHeap.change(5,8);
        maxHeap.print();
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.extractMax());
        }
    }

}