package com.milkyblue;

public class Customer {

  private BarberShop buffer;
  private static int idCount = 0;
  private int id;

  public Customer(BarberShop buffer) {
    this.buffer = buffer;
    this.id = ++idCount;
  }

  public void enter() {
    if (buffer.availableChair()) {
      try {
        buffer.put(this);
      } catch (Exception e) {
        // TODO: handle exception
      }
      System.out.println("[C-" + id + "] Customer is waiting his turn.");
    } else {
      System.out.println("[C-" + id + "] No available chairs, customer leave.");
    }
  }

  public int getId() {
    return id;
  }

  public String toString() {
    return "C-" + id;
  }

}