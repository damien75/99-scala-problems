package exercises

class p15nDuplicateListElements {
  def duplicate[A](numberOfDuplicates: Int, l: List[A]): List[A] =
    l.flatMap(List.fill(numberOfDuplicates)(_))
}
