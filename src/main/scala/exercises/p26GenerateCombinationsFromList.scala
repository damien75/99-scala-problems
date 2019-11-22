package exercises

import scala.reflect.ClassTag
import scala.util.Random

class p26GenerateCombinationsFromList {
  def combinations[A](n: Int, l: List[A]): List[List[A]] = l match {
    case Nil ⇒ List.empty
    case x :: xs ⇒
      if (n <= 0 || l.length < n) {
        List.empty
      } else if (n == 1) {
        l.map(List(_))
      } else {
        combinations(n - 1, xs).map(x :: _) ::: combinations(n, xs)
      }
  }
}
