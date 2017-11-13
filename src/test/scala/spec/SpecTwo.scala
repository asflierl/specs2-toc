package spec

import org.specs2.Specification
import sut.SUT

class SpecTwo extends Specification { def is = s2"""

  This is another specification.

  And now for something completely different. $e1

"""

  def e1 = SUT.somethingCompletelyDifferent should contain("keep-left sign")

}