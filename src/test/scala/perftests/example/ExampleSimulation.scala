package perftests.example

import uk.gov.hmrc.performance.simulation.PerformanceTestRunner
import perftests.example.ExampleRequests._

class ExampleSimulation extends PerformanceTestRunner {

  setup("Calculator-Journey", "Testing the tax calculator") withRequests (
    navigateToCalculatorStartPage,
    postHowMuchYouGetPaid,
    getStatePensionPage
  )

  runSimulation()
}