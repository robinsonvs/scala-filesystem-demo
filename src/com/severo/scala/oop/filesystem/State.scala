package com.severo.scala.oop.filesystem

import com.severo.scala.oop.files.Directory

class State(val root: Directory, val wd: Directory, val outPut: String) {

  def show: Unit = {
    print(outPut)
    print(State.SHELL_TOKEN)
  }

  def setMessage(message: String): State =
    State(root, wd, message)
}


object State {
  val SHELL_TOKEN = "$ "

  def apply(root: Directory, wd: Directory, outPut: String = ""): State =
    new State(root, wd, outPut)
}