package com.javastudy.ch02;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo {
  public static void main(String[] args) {
    // find length
    String name1 = new PredicateDemo().getNameOfLength(3, "aaa", "bbbbb", "cccccc");
    System.out.println(name1);

    // find Char
    String name2 = new PredicateDemo().getNamesStartingWith("c", "aaa", "bbbbb", "cccccc");
    System.out.println(name2);

    // args Predicate
    ImplementPredicate ipd = new ImplementPredicate();
    String name3 = ipd.getNameSatisfyingCondition(new Predicate<String>(){
      @Override
      public boolean test(String name){
        return name.length() == 3;
      }
    }, "aaa", "abc", "gcdq", "jkhg");
    System.out.println(name3);

  }

  public String getNameOfLength(int length, String... names) {
    return Arrays.stream(names)
        .filter(s -> s.length() == length)
        .collect(Collectors.joining(", "));
  }

  public String getNamesStartingWith(String s, String... names) {
    return Arrays.stream(names)
        .filter(name -> name.startsWith(s))
        .collect(Collectors.joining(", "));
  }

}

class ImplementPredicate {
  public String getNameSatisfyingCondition(
      Predicate<String> condition, String... names) {
    return Arrays.stream(names)
        .filter(condition)
        .collect(Collectors.joining(", "));
  }
}

@FunctionalInterface
interface MyPredicate extends Predicate {
  // Predicate abstract method
  // boolean test(T arg0)

  // Predicate default method
  // Predicate abstract method
  // public java.util.function.Predicate<T> and(java.util.function.Predicate<?
  // super T> arg0)
  // public java.util.function.Predicate<T> negate()
  // public java.util.function.Predicate<T> or(java.util.function.Predicate<?
  // super T> arg0)
  // public static <T> java.util.function.Predicate<T> isEqual(java.lang.Object
  // arg0)

}

/*
 * using Predicate args of function
 * Optional.fitler(java.util.function.Predicate<? super T> arg0)
 * Collection.removeIf(java.util.function.Predicate<? super E> arg0)
 * Stream.allMatch(java.util.function.Predicate<? super T> arg0)
 * Stream.anyMatch(java.util.function.Predicate<? super T> arg0)
 * Collectors.partitioningBy(java.util.function.Predicate<? super T> arg0)
 */
