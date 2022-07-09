package com.javastudy.ch01.FunctionalInterface;

// can only have one abstract method
@FunctionalInterface
public interface DemoFunctional {
  boolean isPalidrome(String s);
}

// functional can have own static method and default method
@FunctionalInterface
interface defaultMethod {
  int myMethod();

  default void sayHello(){
    System.out.println("hello");
  }

  static void myStaticMethod(){
    System.out.println("I'm a static method in an interface");
  }
}

// extend interface after is not functional interface
interface MyChildInterface extends DemoFunctional{
  // because parent interface already one abstract method, it also have an abstract methods
  int anotherMethod();
}
