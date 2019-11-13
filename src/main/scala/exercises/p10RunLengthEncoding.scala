package exercises

class p10RunLengthEncoding {
  def encode[A](l: List[A]): List[(Int, A)] =
    new p09ListGroupConsecutiveDuplicates().group(l).map { group ⇒
      (group.size, group.head)
    }
}
