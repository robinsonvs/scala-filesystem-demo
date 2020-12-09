package com.severo.scala.oop.commands

import com.severo.scala.oop.files.DirEntry
import com.severo.scala.oop.filesystem.State

class Ls extends Command {

  override def apply(state: State): State = {
    val contents = state.wd.contents
    val niceOutPut = createNiceOutPut(contents)
    state.setMessage(niceOutPut)
  }

  def createNiceOutPut(contents: List[DirEntry]): String = {
    if (contents.isEmpty) ""
    else {
      val entry = contents.head
      entry.name + "[" + entry.getType + "]\n" + createNiceOutPut(contents.tail)

    }
  }

}
