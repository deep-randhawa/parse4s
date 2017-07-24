import org.joda.time.DateTime

/**
  *
  * @param className
  * @param objectId
  * @param createdAt
  * @param updatedAt
  * @param data
  */
case class ParseObject(className: String,
                       objectId: String,
                       createdAt: DateTime,
                       updatedAt: DateTime,
                       data: ParseData[String, _]) {
  def save = ???
}

private case class ParseData[String, V](dataMap: Map[String, V]) {

  def put(item: (String, V)) = {
    validate(item)
    if (dataMap == null) new ParseData[String, V](Map())
  }

  def put(items: List[(String, V)]) = ???

  def validate(item: (String, V)) = ???

}