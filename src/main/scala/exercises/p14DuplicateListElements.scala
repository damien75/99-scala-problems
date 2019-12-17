package exercises

class p14DuplicateListElements {
  def duplicate[A](l: List[A]): List[A] = l.flatMap(List.fill(2)(_))
}
