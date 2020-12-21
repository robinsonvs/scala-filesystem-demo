package com.severo.scala.oop.filesystem

import java.util.Scanner

import com.severo.scala.oop.commands.Command
import com.severo.scala.oop.files.Directory

object FileSystem extends App {

  val root = Directory.ROOT
  /*
    [1,2,3,4]
    0 (op) 1 => 1
    1 (op) 2 => 3
    3 (op) 3 => 6
    6 (op) 4 => last value, 10

    List(1,2,3,4).foldLeft(0)((x, y) => x + y )
   */
  val initiateState = State(root, root)
  initiateState.show
  io.Source.stdin.getLines().foldLeft(initiateState)((state, line) => {
    val newState = Command.from(line).apply(state)
    newState.show
    newState
  })

}
