package cc.before30.examples.ch01

/**
  * Created by before30 on 30/12/2016.
  */
trait Functor[F[_]] {

  def map[A, B](fa: F[A])(f: A => B): F[B]
}
