package org.parse4s

import org.scalatest.FunSuite

class JsonSerializerTest extends FunSuite {

  test("testToJson") {
    val nestedMap: Map[String, ParseType] = Map("nestedMap" -> ParseNumber(2))
    val map: Map[String, ParseType] = Map("stringK" -> ParseString("str"), "nestedMap" -> ParseData(Some(nestedMap)))
    val pd = ParseData(Some(map))

    assert(pd.serialize == "{\"stringK\":\"str\",\"nestedMap\":{\"nestedMap\":2}}")
  }

}
