package com.javastudy.ch01.ReferenceConstructor;

import java.util.Arrays;
import java.util.List;

public class StreamArrays {
  public static void main(String[] args) {
    String[] names = {"Allan", "Howard", "Jary", "Mary", "Hellen", "John", "Jeason"};
    Person[] people = Arrays.stream(names)
    .map(Person::new)
    .toArray(Person[]::new);

    System.out.println(people.length);
  }
}
