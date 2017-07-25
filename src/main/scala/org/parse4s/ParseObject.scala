package org.parse4s

import org.joda.time.DateTime
import org.parse4s.requests.{PostRequest, PutRequest}

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

private trait ParseType

private case class ParseNumber(value: Number) extends ParseType

private case class ParseString(value: String) extends ParseType

private case class ParseDateTime(value: DateTime) extends ParseType

private case class ParseArray(value: Seq[ParseType]) extends ParseType

private case class ParseData(value: Option[Map[String, ParseType]])
  extends ParseType {
  def put(item: (String, Number)) =
    ParseData(Some(value.getOrElse(Map()) + (item._1 -> ParseNumber(item._2))))

  def put(item: (String, String)) =
    ParseData(Some(value.getOrElse(Map()) + (item._1 -> ParseString(item._2))))

  def put(item: (String, DateTime)) =
    ParseData(Some(value.getOrElse(Map()) + (item._1 -> ParseDateTime(item._2))))

  def put(item: (String, ParseData)) =
    ParseData(Some(value.getOrElse(Map()) + (item._1 -> item._2)))

  def serialize = ???

  def deserialize = ???
}
