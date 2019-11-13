package exercises

class p08EliminateConsecutiveDuplicates {
  def eliminate[A](l: List[A]): List[A] =
    l.foldRight(List.empty[A]) { (a, curList) ⇒
      if (curList.isEmpty || curList.head != a) a :: curList else curList
    }
}
