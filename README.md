[![Build Status](https://secure.travis-ci.org/avh4/imagecomparison-scala.png?branch=master)](http://travis-ci.org/avh4/imagecomparison-scala)

# imagecomparison-scala

Tools for comparing images and writing image-based approval tests.

## Usage

Add the following dependencies to your `build.sbt`:

```scala
  libraryDependencies += "net.avh4.util" % "imagecomparison-scala" % "1.0.0",
  libraryDependencies += "net.avh4.util" % "imagecomparison-swing" % "0.3.2",
```

Use the `lookLike` matcher in your [ScalaTest](http://www.scalatest.org) tests:

```scala
import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

class ImagecomparisonMatchersTest extends FunSpec with ShouldMatchers with ImagecomparisonMatchers {
  describe("about my JComponent subclass") {
    it("draws a snazzy dashboard") {
      new MyJComponent should lookLike("snazzy-dashboard.png")
    }
  }
}
```

You'll probably see something like this:

```
images don't match: expected 81 x 75, but got 97 x 77
org.scalatest.exceptions.TestFailedException: images don't match: expected 81 x 75, but got 97 x 77
```

The actual rendering will be saved to snazzy-dashboard.png in the root of your
project folder.

### What you can test

The `lookLike` matcher currently can check AWT, Swing and SWT objects, and additional renderes can be added.  See the [imagecomparison-java's README](https://github.com/avh4/imagecomparison#what-you-can-test) for details.

