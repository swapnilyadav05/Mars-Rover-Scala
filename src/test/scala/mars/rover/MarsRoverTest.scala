package mars.rover

import mars.rover.models.{Direction, Plateau, Position}
import org.scalatest.FunSuite

class MarsRoverTest extends FunSuite {

  test("position after running instructions 'LMLMLMLMM'") {
    val position = new Position(1, 2, Direction.N);
    val plateau  = new Plateau(5, 5)
    val instructions = "LMLMLMLMM"
    val marsRover = new MarsRover(position, plateau)
    marsRover.runCommands(instructions)
    assert(marsRover.position equals new Position(1, 3, Direction.N))
  }

  test("position after running instructions 'MMRMMRMRRM'") {
    val position = new Position(3, 3, Direction.E);
    val plateau  = new Plateau(5, 5)
    val instructions = "MMRMMRMRRM"
    val marsRover = new MarsRover(position, plateau)
    marsRover.runCommands(instructions)
    assert(marsRover.position equals new Position(5, 1, Direction.E))
  }

  test("position after running Single instruction 'L'") {
    val position = new Position(3, 3, Direction.E);
    val plateau  = new Plateau(5, 5)
    val instructions = "L"
    val marsRover = new MarsRover(position, plateau)
    marsRover.runCommands(instructions)
    assert(marsRover.position.direction == Direction.N)
  }

  test("position after running Single instruction 'R'") {
    val position = new Position(3, 3, Direction.E);
    val plateau  = new Plateau(5, 5)
    val instructions = "R"
    val marsRover = new MarsRover(position, plateau)
    marsRover.runCommands(instructions)
    assert(marsRover.position.direction == Direction.S)
  }

  test("position after running Single instruction 'M'") {
    val position = new Position(3, 3, Direction.E);
    val plateau  = new Plateau(5, 5)
    val instructions = "M"
    val marsRover = new MarsRover(position, plateau)
    marsRover.runCommands(instructions)
    assert(marsRover.position.x == 4)
  }

}
