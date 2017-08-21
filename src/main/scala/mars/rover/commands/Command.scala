package mars.rover.commands

import mars.rover.models.Position

trait Command {
  def move(that: Position)
}
