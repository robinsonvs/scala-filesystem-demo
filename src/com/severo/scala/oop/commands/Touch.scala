package com.severo.scala.oop.commands
import com.severo.scala.oop.files.{DirEntry, File}
import com.severo.scala.oop.filesystem.State

class Touch(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)
}
