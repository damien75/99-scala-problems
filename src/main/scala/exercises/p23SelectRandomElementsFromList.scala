package exercises

import scala.util.Random

class p23SelectRandomElementsFromList {
  def select[A](l: List[A], n: Int): List[A] = {
    val removeFrom = new p20RemoveElementFromList()

    def selectR(l: List[A], n: Int, r: Random): List[A] = {
      if (n <= 0) Nil
      else if (l.isEmpty)
        throw new NoSuchElementException(
          s"Cannot select $n elements from empty list")
      else {
        val t = removeFrom.remove(l, r.nextInt(l.size))
        t._2 :: selectR(t._1, n - 1, r)
      }
    }

    selectR(l, n, new Random())
  }
}
