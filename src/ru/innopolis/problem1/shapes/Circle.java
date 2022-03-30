package ru.innopolis.problem1.shapes;

public class Circle implements Shape {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return radius * radius * 3.14159;
  }
}
