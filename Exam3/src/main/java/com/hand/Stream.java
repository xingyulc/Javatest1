package com.hand;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: JavaTest1
 * @description: Stream
 * @author: lichao
 * @create: 2018-07-19 11:03
 **/

public class Stream implements Product {
    @Override
    public void funmethod(Map<Integer, List<Integer>> nums) {
        System.out.println("使用Java8 Stream");
        nums.forEach((key, value) -> System.out.println(key + "->" + value));
    }
}
