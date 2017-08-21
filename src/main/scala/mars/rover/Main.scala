package mars.rover

import mars.rover.models.{Direction, Plateau, Position}

object Main {
  def main(args: Array[String]): Unit = {
    val position :Position = new Position(3, 3, Direction.E)
    val plateau :Plateau = new Plateau(5, 5)
    val marsRover:MarsRover = new MarsRover(position, plateau)
      marsRover.runCommands("MMRMMRMRRM")
    println(marsRover.position.x + " " + marsRover.position.y + " " + marsRover.position.direction)
  }
}
