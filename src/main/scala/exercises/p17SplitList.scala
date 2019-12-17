package exercises

class p17SplitList {
  def split[A](l: List[A],
               secondListFirstElementIndex: Int): (List[A], List[A]) =
    l.splitAt(secondListFirstElementIndex)
}
