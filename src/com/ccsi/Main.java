package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] arr={1,2,3,4,2};
        System.out.println(containsDuplicate2(arr));
    }
    //Given an array of integers,find if the array contains any duplicates. Your function should return
    //true if any value appears at least twice in the array. and it should return false if
    //every element is distinct.
    //time O(n),space O(n)
    public static boolean containsDuplicate1(int[] nums){
        if(nums==null||nums.length==0)return false;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i]))return true;
        }
        return false;
    }
    //O(nlgn)
    public static boolean containsDuplicate2(int[] nums){
        if(nums==null||nums.length==0)return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1])return true;
        }
        return false;
    }
}
