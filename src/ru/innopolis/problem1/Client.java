package ru.innopolis.problem1;

public class Client {
  public static void main(String[] args) {
    ShapesFactory f1 = new SquaresFactory();
    System.out.print("Area of a new shape created by SquaresFactory = ");
    System.out.println(f1.buildShape().getArea());

    ShapesFactory f2 = new CirclesFactory();
    System.out.print("Area of a new shape created by CirclesFactory = ");
    System.out.println(f2.buildShape().getArea());
  }
}
