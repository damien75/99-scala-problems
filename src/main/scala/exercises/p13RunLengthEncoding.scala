package exercises

class p13RunLengthEncoding {
  def encode[A](l: List[A]): List[(Int, A)] =
    l.foldRight(List.empty[(Int, A)]) { (newElement, curList) ⇒
      curList match {
        case x :: xs ⇒
          if (x._2 == newElement) (x._1 + 1, x._2) :: xs
          else (1, newElement) :: x :: xs
        case _ ⇒ List((1, newElement))
      }
    }
}
