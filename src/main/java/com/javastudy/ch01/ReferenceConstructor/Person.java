package com.javastudy.ch01.ReferenceConstructor;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Person {
  private String name;

  public Person() {
  }

  public Person(Person p) {
    this.name = p.name;
  }


  public Person(String name) {
    this.name = name;
  }

  // Varargs Construct
  public Person(String... names) {
    this.name = Arrays.stream(names)
        .collect(Collectors.joining(" "));
    System.out.println("======= Person Construct =======");
    System.out.println("Varargs ctor, names=" + Arrays.toString(names));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
