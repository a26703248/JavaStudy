package com.javastudy.ch01.InterfaceStaticMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceStatic {
  // In order to solve the function implementation of the same logic of the
  // interface,
  // the interface static method needs to be defined in different categories
  // 為了解決接口相同邏輯的功能實現，卻需要在不同的類中定義接口靜態方法

  public static void main(String[] args) {
    List<String> bonds = Arrays.asList("Connery", "Lazenby", "Moore", "Dalton", "Brosnan", "Craig");

    // ======= Comparator.naturalOrder =======
    // 自然順序(字典順序)
    List<String> sorted = bonds.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
    System.out.println("======= Comparator.naturalOrder =======");
    System.out.println(sorted.toString());

    // ======= Comparator.reverseOrder =======
    // 反向字典順序
    sorted = bonds.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
    System.out.println("======= Comparator.reverseOrder =======");
    System.out.println(sorted.toString());

    // ======= Comparator.comparing =======
    // 以小寫名稱排序
    sorted = bonds.stream()
        .sorted(Comparator.comparing(String::toLowerCase))
        .collect(Collectors.toList());
    System.out.println("======= Comparator.comparing =======");
    System.out.println(sorted.toString());

    // ======= Comparator.naturalOrder =======
    // 以長度排序,相同長度採字典順序
    sorted = bonds.stream()
        .sorted(Comparator.comparingInt(String::length)
            .thenComparing(Comparator.naturalOrder()))
        .collect(Collectors.toList());
    System.out.println("======= Comparator.comparingInt().then() =======");
    System.out.println(sorted.toString());

  }
}
