package mars.rover.commands

import mars.rover.models.{Direction, Position}

class Left extends Command {
  override def move(that: Position): Unit = that.direction match {
    case Direction.E => that.direction =(Direction.N)
    case Direction.W => that.direction =(Direction.S)
    case Direction.N => that.direction =(Direction.W)
    case Direction.S => that.direction =(Direction.E)
  }
}
