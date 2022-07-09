package com.javastudy.ch01.ReferenceConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarargsContructor {
  public static void main(String[] args) {
    String[] names = { "Allan Walker", "Howard A", "Jary A", "Mary B", "Hellen C", "John D", "Jeason E" };

    List<Person> people = Arrays.stream(names)
        .map(name -> name.split(" "))
        .map(Person::new)
        .collect(Collectors.toList());
  }
}
