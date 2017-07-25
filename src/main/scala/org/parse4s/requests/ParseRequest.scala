package org.parse4s.requests

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import org.parse4s.{Parse, ParseConstants, ParseData}
import org.parse4s.requests.HTTP_METHOD.HTTP_METHOD
import play.api.libs.ws.StandaloneWSRequest
import play.api.libs.ws.ahc.StandaloneAhcWSClient

import scala.concurrent.Future
import scala.concurrent.duration.Duration
import ParseConstants._

object HTTP_METHOD extends Enumeration {
  type HTTP_METHOD = Value
  val GET = Value("GET")
  val HEAD = Value("HEAD")
  val POST = Value("POST")
  val PUT = Value("PUT")
  val DELETE = Value("DELETE")
  val CONNECT = Value("CONNECT")
  val OPTIONS = Value("OPTIONS")
}

case class ParseRequest(className: String,
                        method: HTTP_METHOD,
                        data: ParseData = null,
                        followRedirects: Option[Boolean] = Some(true),
                        timeout: Option[Duration] = Some(ParseConstants.TIMEOUT_DURATION),
                        headers: Option[Seq[(String, String)]] = None) {
  implicit val actorSyster = ActorSystem()
  implicit val materializer = ActorMaterializer()
  lazy val wsClient = StandaloneAhcWSClient()

  def execute: Future[StandaloneWSRequest#Response] =
    wsClient.url(Parse.serverURL + className)
      .withMethod(method.toString)
      .withFollowRedirects(followRedirects.get)
      .withRequestTimeout(timeout.get)
      // .withBody(data.serialize)
      .withHttpHeaders(headers getOrElse (Seq()) ++
      // Set up default headers to go with request
      Seq((HEADER_APPLICATION_ID, Parse.applicationID),
        (HEADER_CONTENT_TYPE, CONTENT_TYPE_JSON),
        // TODO SET UP SESSION TOKENS HEADERS
      ): _*)
      .execute()
}