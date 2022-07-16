package com.javastudy.ch02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class SupplierDemo {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger("...");
    // implement Supplier
    DoubleSupplier randomSupplier = new DoubleSupplier() {
      @Override
      public double getAsDouble() {
        return Math.random();
      }
    };
    randomSupplier = () -> Math.random();
    randomSupplier = Math::random;
    Double number = randomSupplier.getAsDouble();
    logger.info(number.toString());

    // How Supplier it works
    // Get the desired name from the collection
    List<String> names = Arrays.asList("Mal", "Wash", "Kaylee", "Inara", "Zoe",
        "jayne", "Simon", "River", "Shepherd Book");
    Optional<String> first = names.stream()
        .filter(name -> name.startsWith("C"))
        .findFirst();

    System.out.println(first);
    System.out.println(first.orElse("None"));

    System.out.println(first.orElse(String.format("No result found in %s",
        names.stream().collect(Collectors.joining(", ")))));


    System.out.println(first.orElseGet(() -> {
      return String.format("No result found in %s",
          names.stream().collect(Collectors.joining(", ")));
    }));
  }
}

/*
 * Supplier Family
 * IntSupplier int getAsInt()
 * DoubleSupplier double getAsDouble()
 * LongSupplier long getAsLong()
 * BooleanSupplier boolean getAsBoolean()
 */

@FunctionalInterface
interface MySupplier extends Supplier {
  // Supplier abstract method
  // T get();
}

/*
 * using Supplier args of function
 * Optional.orElseThrow(java.util.function.Supplier<? extends X> arg0) throws java.lang.Throwable
 * Objects.requireNonNull(T arg0)
 * CompletableFuture.supplyAsync(java.util.function.Supplier<U> arg0)
 * Logger class of all function
 */
