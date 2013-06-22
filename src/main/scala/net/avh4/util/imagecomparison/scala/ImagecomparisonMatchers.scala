package net.avh4.util.imagecomparison.scala

trait ImagecomparisonMatchers {
  val lookLike:(String => LooksLikeMatcher) = new LooksLikeMatcher(_)
  val beApproved = new BeApprovedMatcher
}

object ImagecomparisonMatchers extends ImagecomparisonMatchers