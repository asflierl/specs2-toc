package spec

import org.specs2.Specification

object SuperSpec extends Specification { def is = s2"""

  This is the super spec.

  ${link(SpecOne)}

  ${link(SpecTwo)}

"""

}
