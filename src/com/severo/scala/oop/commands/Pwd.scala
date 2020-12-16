package com.severo.scala.oop.commands

import com.severo.scala.oop.filesystem.State

class Pwd extends Command {

  override def apply(state: State): State =
    state.setMessage(state.wd.path)

}
