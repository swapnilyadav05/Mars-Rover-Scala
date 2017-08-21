package mars.rover.commands

import mars.rover.models.{Direction, Position}

class Right extends Command{
  override def move(that: Position): Unit = that.direction match {
    case Direction.E => that.direction = (Direction.S)
    case Direction.W => that.direction = (Direction.N)
    case Direction.N => that.direction = (Direction.E)
    case Direction.S => that.direction = (Direction.W)
  }
}
