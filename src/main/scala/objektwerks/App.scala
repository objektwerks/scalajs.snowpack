package objektwerks

import com.raquo.laminar.api.L._

import org.scalajs.dom

object App:
  def main(args: Array[String]): Unit =
    render(dom.document.getElementById("container"), div(h1("Scalajs loves Snowpack!")))