package com.allaboutscala.chapter.one.tutorial_06

object HelloWorldWithArguments extends App {
  // As we are extending App we do not need to define a main function.

    println("Hello World from the main function!!")

    println("Command line arguments are:")
    println(args.mkString(", "))

}
