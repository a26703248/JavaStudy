package com.javastudy.ch01.Lambda;

public class AnonymousClass {
  public static void main(String[] args) {

    // inner class
    // 匿名內部類別實作抽象方法
    new Thread(new Runnable(){
      public void run(){
        System.out.println("Inner runnable using an anonymous inner class");
      }
    }).start();

    // inside
    // lambda 實作抽象方法
    new Thread(() -> System.out.println("inside Thread constructor using lambda")).start();

    // assign variable
    // lambda 實作抽象並指派給變數
    Runnable r = () -> System.out.println("assign variable");
    new Thread(r).start();
  }
}

