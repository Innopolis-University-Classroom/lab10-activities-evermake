package ru.innopolis.problem1;

import ru.innopolis.problem1.shapes.Shape;
import ru.innopolis.problem1.shapes.Square;

public class SquaresFactory extends ShapesFactory {

  @Override
  public Shape buildShape() {
    return new Square(1);
  }
}
