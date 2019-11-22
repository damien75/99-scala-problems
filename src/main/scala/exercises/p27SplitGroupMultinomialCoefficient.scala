package exercises

class p27SplitGroupMultinomialCoefficient {
  def group[A](partitions: List[Int], l: List[A]): List[List[List[A]]] = {
    val combinator = new p26GenerateCombinationsFromList()
    partitions match {
      case Nil ⇒ List(Nil)
      case n :: ns ⇒
        combinator.combinations(n, l).flatMap { c ⇒
          group(ns, l diff c).map(c :: _)
        }
    }
  }
}
