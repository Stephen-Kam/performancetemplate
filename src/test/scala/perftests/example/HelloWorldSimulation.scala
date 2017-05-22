package perftests.example

import uk.gov.hmrc.performance.simulation.PerformanceTestRunner
import perftests.example.HelloWorldRequests._

class HelloWorldSimulation extends PerformanceTestRunner {

  setup("login", "Login") withRequests (navigateToLoginPage, submitLogin)

  setup("home", "Go to the homepage") withRequests navigateToHome

  runSimulation()
}