val x: Int = 1

val xs: List[Int] = List(1, 2, 3)

def food[A, B](x: A, y: B) = {
  println("hi" + x.getClass)
  println("hi2" + y.getClass)
}

food(1, 1L)

food(Some(1), Some("string"))

Some(1).get
Some("String").get
