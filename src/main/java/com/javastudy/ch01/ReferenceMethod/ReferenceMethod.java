package com.javastudy.ch01.ReferenceMethod;

import java.util.stream.Stream;

public class ReferenceMethod {
  public static void main(String[] args) {
    System.out.println("=======Object::instanceMethod========");
    // Object::instanceMethod
    Stream.of("this", "is", "a", "stream", "of", "string")
        .forEach(System.out::println);

    System.out.println("=======Class::staticMethod========");
    // Class::staticMethod
    Integer maxNumber = Stream.of(1, 3, 5, 7, 8, 6, 2)
        .reduce(Math::max)
        .get();

    System.out.println(maxNumber);

    System.out.println("=======Class::instanceMethod========");
    // Class::instanceMethod
    Stream.of("this", "is", "a", "stream", "of", "string")
        .map(String::length)
        .forEach(System.out::println);
  }

}
