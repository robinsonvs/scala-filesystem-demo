package com.severo.scala.oop.filesystem

import java.util.Scanner

import com.severo.scala.oop.commands.Command
import com.severo.scala.oop.files.Directory

object FileSystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while(true) {
    state.show
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }

}
