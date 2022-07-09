package com.javastudy.ch01.ReferenceMethod;

import java.util.stream.Stream;

public class ReferenceMethod {
  public static void main(String[] args) {
    System.out.println("=======Object::instanceMethod========");
    // Object::instanceMethod
    // 物件實體方法參考
    // System.out::println
    Stream.of("this", "is", "a", "stream", "of", "string")
        .forEach(System.out::println);

    System.out.println("=======Class::staticMethod========");
    // Class::staticMethod
    // 物件靜態方法參考
    // Math::max
    Integer maxNumber = Stream.of(1, 3, 5, 7, 8, 6, 2)
        .reduce(Math::max)
        .get();

    System.out.println(maxNumber);

    System.out.println("=======Class::instanceMethod========");
    // Class::instanceMethod
    // 類別實體方法參考
    // String::length
    Stream.of("this", "is", "a", "stream", "of", "string")
        .map(String::length)
        .forEach(System.out::println);
  }

}
