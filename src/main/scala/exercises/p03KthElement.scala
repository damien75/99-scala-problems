package exercises

/**
  * Created by damiengoblot on 2017-05-06.
  */
class p03KthElement {
  def kth[A](l: List[A], k: Int): A = {
    if (k >= 0) l(k)
    else throw new NoSuchElementException
  }
}
