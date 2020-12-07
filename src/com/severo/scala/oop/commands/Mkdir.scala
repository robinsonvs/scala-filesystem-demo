package com.severo.scala.oop.commands

import com.severo.scala.oop.files.Directory
import com.severo.scala.oop.filesystem.State

class Mkdir(name: String) extends Command {

  override def apply(state: State): State = {
    val wd = state.wd
    if (wd.hasEntry(name)) {
      state.setMessage("Entry " + name + " already exists !")
    } else if (name.contains(Directory.SEPARATOR)) {
      state.setMessage(name + " must not contain separators !")
    } else if (checkIllegal(name)) {
      state.setMessage((name + ": illegal entry name !"))
    } else {
      doMkdir(state, name)
    }
  }

  def checkIllegal(name: String): Boolean = {
    name.contains(".")
  }

  def doMkdir(state: State, name: String): State = {
    ???
  }
}
