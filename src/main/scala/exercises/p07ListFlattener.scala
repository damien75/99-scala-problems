package exercises

class p07ListFlattener {
  def flatten[A](l: List[Any]): List[A] = l flatMap {
    case el: List[_] ⇒ flatten(el)
    case el: A ⇒ List(el)
  }
}
