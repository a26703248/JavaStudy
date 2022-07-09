package com.javastudy.ch01.Lambda;

public class AnonymousClass {
  public static void main(String[] args) {

    // inner class
    new Thread(new Runnable(){
      public void run(){
        System.out.println("Inner runnable using an anonymous inner class");
      }
    }).start();

    // inside
    new Thread(() -> System.out.println("inside Thread constructor using lambda")).start();

    // assign variable
    Runnable r = () -> System.out.println("assign variable");
    new Thread(r).start();
  }
}

