package cc.before30.examples.ch02

import scala.annotation.tailrec

/**
  * Created by before30 on 10/01/2017.
  */
object Exercise {

}

object Exercise1 {
  def fib(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fib(n-1) + fib(n-2)
  }

  // fn = fn-1 + fn-2
  def fib2(n: Int): Int = {

    @tailrec
    def loop(n: Int, previous: Int, current: Int): Int = {
      if (n == 0) previous
      else loop(n-1, current, current + previous)
    }
    loop(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    println(fib(0) + " " + fib2(0))
    println(fib(1) + " " + fib2(1))
    println(fib(2) + " " + fib2(2))
    println(fib(3) + " " + fib2(3))
    println(fib(4) + " " + fib2(4))
    println(fib(5) + " " + fib2(5))
    println(fib(6) + " " + fib2(6))
    println(fib(7) + " " + fib2(7))
  }
}

object Exercise2 {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(idx: Integer, result: Boolean): Boolean = {
      if (result == false) result
      else if(idx+1 >= as.length) result
      else loop(idx+1, ordered(as(idx), as(idx+1)))
    }

    loop(0, true)
  }

  def main(args: Array[String]): Unit = {
    println(isSorted[Int](List(1,2,3,2).toArray[Int], (x,y) => x < y))
    println(isSorted[Int](List(1,2,3,4).toArray[Int], (x,y) => x < y))
    println(isSorted[Int](List(1,2,3,100).toArray[Int], (x,y) => x < y))
    println(isSorted[Int](List(4,3,2,1).toArray[Int], (x,y) => x > y))
  }
}


object Exercise3 {
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    a: A => b: B => f(a, b)
  }

  def main(args: Array[String]): Unit = {

  }
}

object Exercies4 {
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a, b) => f(a)(b)
  }
}

object Exercise5 {
  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }
}