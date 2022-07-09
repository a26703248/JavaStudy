package com.javastudy.ch01.ReferenceConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferenceConstructor {
  public static void main(String[] args) {

    // normal
    List<String> names1 = Stream.of("Hellen", "Allan", "Hook", "Mery", "Jery")
    .map(name -> new Person(name))
    .map(person -> person.getName())
    .collect(Collectors.toList());

    // referenceMethod
    List<String> names2 = Stream.of("Hellen", "Allan", "Hook", "Mery", "Jery")
    .map(Person::new)
    .map(Person::getName)
    .collect(Collectors.toList());

  }
}
