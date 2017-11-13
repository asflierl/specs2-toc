package spec

import org.specs2.Specification
import sut.SUT

class SpecOne extends Specification { def is = s2"""

  This is a specification.

  Something should equal 42. $e1

"""

  def e1 = SUT.something shouldEqual 42

}