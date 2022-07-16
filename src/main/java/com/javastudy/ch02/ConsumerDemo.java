package com.javastudy.ch02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
    strings.forEach(new Consumer<String>(){
      @Override
      public void accept(String s){
        System.out.println(s);
      }
    });
  }
}

/*
 * Consumer Family
 * IntConsumer void accept(int x)
 * doubleConsumer void accept(double x)
 * LongConsumer void accept(long x)
 * BiConsumer void accept(T t, U u)
 */

@FunctionalInterface
interface MyConsumer extends Consumer{
  // Consumer abstract methods
  // void accept(T t);

  // Consumer default methods
  // using to composition(組合)
  // public  java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T> arg0) {
  //   return null;
  // }
}

/*
 * using Consumer class of function
 * Optional.ifPercents(Consumer<? super T> consumer)
 * Stream.forEach(Consumer<? super T> action)
 * Stream.peek(Consumer<? super T> consumer)
 */

@FunctionalInterface
interface MyIterable extends Iterable{

  // Iterable default methods args is Consumer class
  // public  void forEach(java.util.function.Consumer<? super T> arg0) {
  // }
}
