package com.webfejl.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Car")
public class Car implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String brand;

  private int year;

  private String color;

  private int hpower;

  public Car() {}

  public Car(Long id, String brand, int year, String color, int hpower) {
    this.id = id;
    this.brand = brand;
    this.year = year;
    this.color = color;
    this.hpower = hpower;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getHpower() { return hpower; }

  public void setHpower(int hpower) { this.hpower = hpower; }
}
