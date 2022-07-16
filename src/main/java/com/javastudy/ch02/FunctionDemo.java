package com.javastudy.ch02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Mal", "Wash", "Kaylee", "Inara", "Zoe",
        "jayne", "Simon", "River", "Shepherd Book");
    List<Integer> nameLengths = names.stream()
        .map(new Function<String, Integer>() {
          @Override
          public Integer apply(String s) {
            return s.length();
          }
        })
        .collect(Collectors.toList());

    nameLengths = names.stream()
        .map(s -> s.length())
        .collect(Collectors.toList());

    nameLengths = names.stream()
        .map(String::length)
        .collect(Collectors.toList());

    System.out.printf("nameLengths = %s\n", nameLengths);
  }
}

/*
 * Function Family
 * IntFunction R apply(int value)
 * DoubleFunction R apply(double value)
 * LongFunction R apply(long value)
 *
 * ToIntFunction int applyAsInt(T value)
 * ToDoubleFunction double applyAsDouble(T value)
 * ToLongFunction long applyAsLong(T value)
 *
 * DoubleToIntFunction int applyAsInt(double value)
 * DoubleToLongFunction long applyAsLong(double value)
 *
 * IntToDoubleFunction double applyAsDouble(int value)
 * IntToLongFunction long applyAsLong(int value)
 *
 * LongToDoubleFunction double applyAsDouble(long value)
 * LongToIntFunction int applyAsInt(long value)
 *
 * BiFunction void accept(T t, U u)
 * ToIntBiFunction int applyAsInt(T t, U u)
 * ToDoubleBiFunction double applyAsDouble(T t, U u)
 * ToLongBiFunction lon applyAsLong(T t, U u)
 *
 */

@FunctionalInterface
interface MyFunction extends Function {
  // Function abstract method
  // R apply(T t)

  // Function default method
  // public <V> java.util.function.Function<V,R>
  // compose(java.util.function.Function<? super V,? extends T> arg0)
  // public <V> java.util.function.Function<T,V>
  // andThen(java.util.function.Function<? super R,? extends V> arg0)

  // identity static function is lambda expression
  // public static <T> java.util.function.Function<T,T> identity()

}

/*
 * using Function args of function
 * Map.computeIfAbsent(K arg0, java.util.function.Function<? super K,? extends V> arg1)
 * Comparator.comparing(java.util.function.Function<? super T,? extends U> arg0, java.util.Comparator<? super U> arg1)
 * Comparator.thenComparing(java.util.function.Function<? super T,? extends U> arg0)
 */
