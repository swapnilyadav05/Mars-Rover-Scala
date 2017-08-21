package mars.rover.commands

import mars.rover.models.{Direction, Plateau, Position}
import org.scalatest.FunSuite

class MoveTest extends FunSuite {

  test("moving toward E") {
    val plateau = new Plateau(5, 5)
    val move = new Move(plateau);
    val position = new Position(1, 2, Direction.E);
    move.move(position);
    assert(position.x == 2)
  }

  test("moving toward W") {
    val plateau = new Plateau(5, 5)
    val move = new Move(plateau);
    val position = new Position(1, 2, Direction.W);
    move.move(position);
    assert(position.x == 0)
  }

  test("moving toward N") {
    val plateau = new Plateau(5, 5)
    val move = new Move(plateau);
    val position = new Position(1, 2, Direction.N);
    move.move(position);
    assert(position.y == 3)
  }

  test("moving toward S") {
    val plateau = new Plateau(5, 5)
    val move = new Move(plateau);
    val position = new Position(1, 2, Direction.S);
    move.move(position);
    assert(position.y == 1)
  }

  test("moving toward N to check limit of plateau") {
    val plateau = new Plateau(5, 5)
    val move = new Move(plateau);
    val position = new Position(1, 5, Direction.N);
    move.move(position);
    assert(position.y == 5)
  }

  test("moving toward S to check limit of plateau") {
    val plateau = new Plateau(5, 5)
    val move = new Move(plateau);
    val position = new Position(1, 0, Direction.S);
    move.move(position);
    assert(position.y == 0)
  }

  test("moving toward E to check limit of plateau") {
    val plateau = new Plateau(5, 5)
    val move = new Move(plateau);
    val position = new Position(5, 1, Direction.E);
    move.move(position);
    assert(position.x == 5)
  }

  test("moving toward W to check limit of plateau") {
    val plateau = new Plateau(5, 5)
    val move = new Move(plateau);
    val position = new Position(0, 5, Direction.W);
    move.move(position);
    assert(position.x == 0)
  }

}
