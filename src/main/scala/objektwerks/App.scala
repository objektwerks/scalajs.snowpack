package objektwerks

import org.scalajs.dom.document

object App:
  def main(args: Array[String]): Unit =
    val paragraph = document.createElement("p")
    paragraph.textContent = "Scalajs loves Snowpack!"
    document.body.appendChild(paragraph)