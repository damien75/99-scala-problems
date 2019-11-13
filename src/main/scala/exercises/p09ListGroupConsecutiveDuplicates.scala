package exercises

class p09ListGroupConsecutiveDuplicates {
  def group[A](l: List[A]): List[List[A]] =
    if (l.isEmpty) List(List())
    else {
      val (grouped, next) = l span { _ == l.head }
      if (next == Nil) List(grouped) else grouped :: group(next)
    }
}
