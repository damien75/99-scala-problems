package p06

import org.scalatest.FunSuite

class ListPalindromeSuite extends FunSuite {
  test("Should return true if the input list of odd size is a palindrome"){
    assertResult(true){new ListPalindrome().isPalindrome(List(1, 2, 3, 4, 3, 2, 1))}
  }

  test("Should return false if the input list of odd size is not a palindrome"){
    assertResult(false){new ListPalindrome().isPalindrome(List(1, 2, 3, 4, 7, 2, 1))}
  }

  test("Should return true if the input list of even size is a palindrome"){
    assertResult(true){new ListPalindrome().isPalindrome(List(1, 2, 3, 3, 2, 1))}
  }

  test("Should return false if the input list of even size is not a palindrome"){
    assertResult(false){new ListPalindrome().isPalindrome(List(1, 2, 3, 3, 4, 5))}
  }
}
