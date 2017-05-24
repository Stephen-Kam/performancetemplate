package perftests.example

import uk.gov.hmrc.performance.conf.ServicesConfiguration
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object ExampleRequests extends ServicesConfiguration {

  val baseUrl = baseUrlFor("tax-calculator-service")

  val navigateToCalculatorStartPage =
    http("Navigate to Calculator Start Page")
      .get(s"$baseUrl/your-pay")
      .check(status.is(200))


  val postHowMuchYouGetPaid =
    http("Submit amount and period")
      .post(s"$baseUrl/your-pay": String)
      .formParam("amount", "30000")
      .formParam("period", "a year")
      .check(status.is(303))


  val getStatePensionPage =
    http("Get State Pension Page")
      .get(s"$baseUrl/state-pension")
      .check(status.is(200))

}