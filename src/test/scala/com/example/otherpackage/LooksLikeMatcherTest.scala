package com.example.otherpackage

import org.scalatest.FunSpec
import javax.imageio.ImageIO
import org.scalatest.matchers.ShouldMatchers
import net.avh4.util.imagecomparison.scala.LooksLikeMatcher

class LooksLikeMatcherTest extends FunSpec with ShouldMatchers {

  val expectedResourceName = "example2.png"
  val subject = new LooksLikeMatcher(expectedResourceName)
  val example_png = ImageIO.read(getClass.getResource("example2.png"))
  val other_png = ImageIO.read(getClass.getResource("other2.png"))

  describe("with a matching image") {
    val result = subject.apply(example_png)

    it("should return a passing result") {
      result.matches should equal(true)
    }
  }

  describe("with an image that doesn't match") {
    val result = subject.apply(other_png)

    it("should return a failing result") {
      result.matches should equal(false)
    }

    it("should provide a description of the failure") {
      result.failureMessage should equal("images don't match: expected 97 x 77, but got 81 x 75")
    }
  }
}
