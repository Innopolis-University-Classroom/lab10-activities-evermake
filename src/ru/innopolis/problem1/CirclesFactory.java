package ru.innopolis.problem1;

import ru.innopolis.problem1.shapes.Circle;
import ru.innopolis.problem1.shapes.Shape;

public class CirclesFactory extends ShapesFactory {

  @Override
  public Shape buildShape() {
    return new Circle(1);
  }
}
