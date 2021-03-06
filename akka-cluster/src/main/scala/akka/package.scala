/**
 *  Copyright (C) 2009-2011 Scalable Solutions AB <http://scalablesolutions.se>
 */

package akka

package object serialization {
  type JsValue = _root_.dispatch.json.JsValue
  val JsValue = _root_.dispatch.json.JsValue
  val Js = _root_.dispatch.json.Js
  val JsonSerialization = sjson.json.JsonSerialization
  val DefaultProtocol = sjson.json.DefaultProtocol
}
