package com.javastudy.ch01.FunctionalDefaultMethod;

public class InterfaceDefaultMethod {
  public static void main(String[] args) {
    Company1 c1 = new Company1();
    Company2 c2 = new Company2();
    System.out.println(c1.getName());
    System.out.println(c2.getName());
  }
}

interface Employee {
  String getFirst();
  String getLast();

  public void convertCaffeineToCodeForMoney();

  default String getName(){
    return String.format("employee=%s %s", getFirst(), getLast());
  }
}

class Company1 implements Employee{

  @Override
  public String getFirst() {
    return "company1";
  }

  @Override
  public String getLast() {
    return "company1";
  }

  @Override
  public void convertCaffeineToCodeForMoney() {
    System.out.println("company1");
  }
}

class Company2 implements Employee{

  @Override
  public String getFirst() {
    return "company2";
  }

  @Override
  public String getLast() {
    return "company2";
  }

  @Override
  public void convertCaffeineToCodeForMoney() {
    System.out.println("company2");
  }

  public String getName(){
    return String.format("company2=%s %s", getFirst(), getLast());
  }
}
