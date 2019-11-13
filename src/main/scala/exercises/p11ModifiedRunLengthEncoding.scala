package exercises

class p11ModifiedRunLengthEncoding {
  def encodeModified[A](l: List[A]): List[Either[A, (Int, A)]] =
    new p09ListGroupConsecutiveDuplicates().group(l).map { group ⇒
      if (group.size == 1) Left(group.head) else Right(group.size, group.head)
    }
}
