package net.avh4.util.imagecomparison.scala

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers
import javax.imageio.ImageIO

class ImagecomparisonMatchersTest extends FunSpec with ShouldMatchers with ImagecomparisonMatchers {
  val o = ImageIO.read(getClass().getResource("example.png"))

  describe("lookLike matcher") {
    it("should pass for matching images") {
      o should lookLike("example.png")
    }
  }
}
