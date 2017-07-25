package org.parse4s

import org.joda.time.DateTime
import org.parse4s.requests.{PostRequest, PutRequest}

import scala.collection.mutable.ListBuffer

/**
  *
  * @param className
  * @param objectId
  * @param createdAt
  * @param updatedAt
  * @param data
  */
case class ParseObject(className: String,
                       objectId: Option[String] = None,
                       createdAt: Option[DateTime] = None,
                       updatedAt: Option[DateTime] = None,
                       data: ParseData) {

  /**
    * Will call [[org.parse4s.requests.PostRequest]] to send request to server
    *
    * @return
    */
  def save = {
    if (objectId isEmpty) new PostRequest(className = className, data = data)
    else new PutRequest(className = className, data = data)
  }
}

trait ParseType

case class ParseNumber(value: Number) extends ParseType

case class ParseString(value: String) extends ParseType

case class ParseDateTime(value: DateTime) extends ParseType

case class ParseArray(value: Seq[ParseType]) extends ParseType

case class ParseData(value: Option[Map[String, ParseType]])
  extends ParseType {
  def putNumber(item: (String, Number)) =
    ParseData(Some(value.getOrElse(Map()) + (item._1 -> ParseNumber(item._2))))

  def putString(item: (String, String)) =
    ParseData(Some(value.getOrElse(Map()) + (item._1 -> ParseString(item._2))))

  def putDateTime(item: (String, DateTime)) =
    ParseData(Some(value.getOrElse(Map()) + (item._1 -> ParseDateTime(item._2))))

  def putParseData(item: (String, ParseData)) =
    ParseData(Some(value.getOrElse(Map()) + (item._1 -> item._2)))

  def serialize: String = {
    var json = new ListBuffer[String]()
    for ((k, v) <- this.value.get) {
      if (!k.isInstanceOf[String]) throw new ParseException("Keys must be alphanumeric strings.")
      if (!v.isInstanceOf[ParseType]) throw new ParseException("Values should conform to internal ParseType")
      v match {
        case n: ParseNumber => json += "\"" + k + "\":" + n.value
        case s: ParseString => json += "\"" + k + "\":\"" + s.value + "\""
        case dt: ParseDateTime => json += "\"" + k + "\":\"" + ParseConstants.TIME_FORMAT.print(dt.value) // TODO Fix Error
        case a: ParseArray => ; // TODO
        case m: ParseData => json += "\"" + k + "\":" + m.serialize
      }
    }
    return "{" + json.mkString(",") + "}"
  }
}
