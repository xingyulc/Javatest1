package com.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> nums = new ArrayList<>();
        for(int i = 101; i <= 200; i++){
            int count = 0;
            for (int j = 2; j < i; j++){
                if(i % j == 0)
                    count++;
                else
                    break;
            }
            if (count == 0)
                nums.add(i);
        }
        System.out.println("101-200间总共有"+nums.size()+"个素数，分别是:"+nums);
    }
}
