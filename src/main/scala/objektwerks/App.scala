package objektwerks

import org.scalajs.dom

object App:
  def main(args: Array[String]): Unit =
    val paragraph = dom.document.createElement("p")
    paragraph.textContent = "Scalajs loves Snowpack!"
    dom.document.body.appendChild(paragraph)