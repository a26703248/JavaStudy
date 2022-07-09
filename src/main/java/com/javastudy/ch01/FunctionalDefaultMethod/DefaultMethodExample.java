package com.javastudy.ch01.FunctionalDefaultMethod;

import java.util.Arrays;
import java.util.List;

public class DefaultMethodExample {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5, 9);
    // using Collection default removeIf
    boolean removed = nums.removeIf(n -> n <=0);
    System.out.println("Element were " + (removed? "" : "NOT") + " removed");
    // using Iterator default forEach
    nums.forEach(System.out::println);
  }
}
