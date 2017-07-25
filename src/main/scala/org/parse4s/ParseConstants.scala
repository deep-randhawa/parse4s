package org.parse4s

import scala.concurrent.duration._

object ParseConstants {
  // HEADERS
  val HEADER_CONTENT_TYPE = "Content-Type"
  val HEADER_APPLICATION_ID = "X-Parse-Application-Id"
  val HEADER_REST_API_KEY = "X-Parse-REST-API-Key"
  val HEADER_MASTER_KEY = "X-Parse-Master-Key"
  val HEADER_SESSION_TOKEN = "X-Parse-Session-Token"

  val CONTENT_TYPE_JSON = "application/json"

  // PARSE FIELDs
  val FIELD_OBJECT_ID = "objectId"
  val FIELD_CREATED_AT = "createdAt"
  val FIELD_UPDATED_AT = "updatedAt"
  val FIELD_SESSION_TOKEN = "sessionToken"

  // OPERATIONS
  val OPERATION = "__op"
  val TYPE = "__type"

  val INCREMENT = "Increment"
  val ADD = "Add"
  val ADD_UNIQUE = "AddUnique"
  val REMOVE = "Remove"

  val AMOUNT = "amount"
  val OBJECTS = "objects"
  val POINTER = "Pointer"

  // PARSE ENDPOINTS
  val CLASSES_ENDPOINT = "classes/"

  val MAX_PARSE_FILE_SIZE = 10485760
  val TIMEOUT_DURATION = 10000 millis
  val TIME_FORMAT = "YYYY-MM-DDTHH:MM:SS.MMMZ"
}
