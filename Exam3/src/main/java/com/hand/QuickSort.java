package com.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: JavaTest1
 * @description: 快速排序
 * @author: lichao
 * @create: 2018-07-19 10:22
 **/

public class QuickSort {

    List<Integer> listSort(List<Integer> list){
        int[] nums = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            nums[i] = list.get(i);
        }
        int[] numsaf = quickSort(nums);
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i<list.size();i++){
           list1.add(numsaf[i]);
        }
        return list1;
    }

    public int[] quickSort(int[] array) {
        sort(array,0,array.length-1);
        return array;
    }
    public void sort(int array[],int p, int r) {
        int q=0;
        if(p<r) {
            q=partition(array,p,r);
            sort(array,p,q-1);
            sort(array,q+1,r);
        }
    }
    public int partition(int[] a, int p, int r) {
        int x=a[r];
        int j=p-1;
        for (int i=p;i<=r-1;i++) {
            if (a[i]<=x) {
                j++;
                swap(a,j,i);
            }
        }
        swap(a,j+1,r);
        return j+1;
    }
    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
