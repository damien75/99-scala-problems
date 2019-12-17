package exercises

import java.util.NoSuchElementException

/**
  * Created by damiengoblot on 2017-04-16.
  */
class p02SecondToLastElement {
  @scala.annotation.tailrec
  final def secondToLast[A](list: List[A]): A = list match {
    case s_to_last :: _ :: Nil => s_to_last
    case _ :: tail             => secondToLast(tail)
    case _                     => throw new NoSuchElementException
  }
}
