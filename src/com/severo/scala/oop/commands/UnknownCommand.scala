package com.severo.scala.oop.commands

import com.severo.scala.oop.filesystem.State

class UnknownCommand extends Command {

  override def apply(state: State): State =
    state.setMessage("Command not found")
}
