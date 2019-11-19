package exercises

class p21InsertElementToList {
  def insert[A](l: List[A], insertElementAtIndex: Int, element: A): List[A] = {
    val tuple = l.splitAt(insertElementAtIndex)
    tuple._1 ::: element :: tuple._2
  }
}
