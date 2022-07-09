package com.javastudy.ch01.ReferenceConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CopyContructor {
  public static void main(String[] args) {
    // same Object and Memory location
    // 指向相同物件
    System.out.println("======== same Object and Memory location ========");
    Person before = new Person("Grace");
    List<Person> people = Stream.of(before)
        .collect(Collectors.toList());
    Person after = people.get(0);

    if (before == after) {
      System.out.println("記憶位置相同");
    } else {
      System.out.println("記憶位置不相同");
    }

    before.setName("Allan");
    if (after.getName().equals("Allan")) {
      System.out.println("名稱相同");
    } else {
      System.out.println("名稱不相同");
    }

    // not same Object and Memory location, but same attributes
    // 複製的物件
    System.out.println("======== not same Object and Memory location ========");

    people = Stream.of(before)
        .map(Person::new)
        .collect(Collectors.toList());

    after = people.get(0);
    if (before == after) {
      System.out.println("記憶位置相同");
    } else {
      System.out.println("記憶位置不相同");
    }

    before.setName("Allan");
    if (after.getName().equals("Allan")) {
      System.out.println("名稱相同");
    } else {
      System.out.println("名稱不相同");
    }


  }
}
