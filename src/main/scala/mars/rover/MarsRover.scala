package mars.rover

import mars.rover.commands.{ Left, Move, Right}
import mars.rover.models.{Plateau, Position}

class MarsRover(val position :Position, val plateau :Plateau) {

  def runCommands(commands :String):Unit = {
    commands.split("").map{
      case "L" =>  new Left()
      case "R" =>  new Right()
      case "M" =>  new Move(plateau)
    }.foreach((command)=> command move position)

  }
}
