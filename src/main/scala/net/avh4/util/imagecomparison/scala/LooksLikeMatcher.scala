package net.avh4.util.imagecomparison.scala

import org.scalatest.matchers.{MatchResult, Matcher}
import net.avh4.util.imagecomparison.LooksLikeHelper
import net.avh4.util.reflection.StackUtils

class LooksLikeMatcher(resourceName: String) extends Matcher[Any] {
  val callingClass = StackUtils.getCallingClass()
  val helper = new LooksLikeHelper(resourceName, callingClass)

  def apply(actual: Any) = {
    helper.checkAndWriteFailingImage(actual)
    MatchResult(helper.matches, helper.mismatchDescription, "")
  }
}
