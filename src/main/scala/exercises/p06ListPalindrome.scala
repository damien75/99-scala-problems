package exercises

class p06ListPalindrome {
  def isPalindrome[A](l: List[A]): Boolean = {
    l.size % 2 match {
      case 0 ⇒
        val (left, right) = l.splitAt((l.size + 1) / 2)
        left.reverse == right
      case 1 ⇒
        val (left, right) = l.splitAt(l.size / 2)
        right.drop(1).reverse == left
    }
  }
}
