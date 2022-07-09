package com.javastudy.ch01.FunctionalDefaultMethod;

import java.util.Collection;
import java.util.AbstractCollection;

public class DiamondProblem {
  public static void main(String[] args) {
    // Animal animal = new Pegaus();
    // animal.speak();
  }
}

interface Animal {
  void speak();
}

class Horse implements Animal {

  @Override
  public void speak() {
    System.out.println("ho ho");
  }
}

class Bird implements Animal {
  @Override
  public void speak() {
    System.out.println("ju ju");
  }
}


// what is speak
// class Pegaus implements Horse, Bird {
// }

