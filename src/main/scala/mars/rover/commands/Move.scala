package mars.rover.commands


import mars.rover.models.{Direction, Plateau, Position}

class Move(plateau: Plateau) extends Command {
  override def move(that: Position): Unit = that.direction match {
    case Direction.E => that.x = (if (that.x + 1 > plateau.topX) that.x else that.x + 1)
    case Direction.W => that.x = (if (that.x - 1 < plateau.bottomX) that.x else that.x - 1)
    case Direction.N => that.y = (if (that.y + 1 > plateau.topY) that.y else that.y + 1)
    case Direction.S => that.y = (if (that.y - 1 < plateau.bottomY) that.y else that.y - 1)
  }
}
