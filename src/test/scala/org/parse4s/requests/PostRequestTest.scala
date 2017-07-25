package org.parse4s.requests

import scala.util.Success
import scala.util.Failure
import org.scalatest.{AsyncFunSuite}

class PostRequestTest extends AsyncFunSuite {

  test("sending POST request") {
    // import scala.concurrent.ExecutionContext.Implicits.global
    val l = new PostRequest("GameScore", data = null).execute
    l.onComplete {
      case Success(resp)
      => print(resp)
      case Failure(t)
      => print(t)
    }
  }

}
