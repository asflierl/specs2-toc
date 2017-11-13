package spec

import org.specs2.Specification
import sut.SUT

object SpecThree extends Specification { def is = s2"""

  This is the third specification.

  Wat. $e1

"""

  def e1 = SUT.wat shouldEqual "wat"

}