package com.severo.scala.oop.commands
import com.severo.scala.oop.files.{DirEntry, Directory}
import com.severo.scala.oop.filesystem.State

class Mkdir(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path, name)
}
