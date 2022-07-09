package com.javastudy.ch01.FunctionalInterface;

// can only have one abstract method
// 泛函介面只能擁有一個抽象方法
@FunctionalInterface
public interface DemoFunctional {
  boolean isPalidrome(String s);
}

// functional can have own static method and default method
// 泛函介面可以擁有靜態和預設方法
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
// 雖然自己只有一個抽象方法但超類別也有一個抽象方法不能定義回泛函介面
interface MyChildInterface extends DemoFunctional{
  // because parent interface already one abstract method, it also have an abstract methods
  int anotherMethod();
}
