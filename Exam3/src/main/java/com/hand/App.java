package com.hand;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("第三题：===============================");
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Random random = new Random();
            int num = (int) (random.nextFloat() * 100);
            nums.add(num);
        }

        Map<Integer, List<Integer>> numsDivide = new HashMap<>();
        List<Integer> keys = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int num = nums.get(i);
            int key = num / 10;
            if (numsDivide.get(key) != null) {
                numsDivide.get(key).add(num);
            } else {
                List<Integer> values = new ArrayList<>();
                values.add(num);
                numsDivide.put(key, values);
                keys.add(key);
            }
        }
        System.out.println("排序前");
        numsDivide.forEach((key, value) -> System.out.println(key + "->" + value));

        int[] nus = {9, 10, 34, 0, 2};
        QuickSort quickSort = new QuickSort();

        numsDivide.forEach((key, value) -> {
            quickSort.listSort(value);
        });
        Map<Integer, List<Integer>> newNums = new HashMap<>();
        for (int key : keys) {
            newNums.put(key, quickSort.listSort(numsDivide.get(key)));
        }
        System.out.println("排序后");
        newNums.forEach((key, value) -> System.out.println(key + "->" + value));


        Factory factory;
        factory = new ConcreteFactory();
        Product product;
        product = factory.create("Stream");
        product.funmethod(newNums);

        Factory factoryOther = new ConcreteFactory();
        Product productOther = factoryOther.create("others");
        productOther.funmethod(newNums);
    }
}
