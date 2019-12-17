package exercises

class p20RemoveElementFromList {
  def remove[A](l: List[A], indexOfElementToRemove: Int): (List[A], A) = {
    if (indexOfElementToRemove < 0 || indexOfElementToRemove >= l.size)
      throw new NoSuchElementException(
        s"Provided index $indexOfElementToRemove is either negative or greater than the list size")
    val split = l.splitAt(indexOfElementToRemove)
    (split._1 ::: split._2.tail, split._2.head)
  }
}
