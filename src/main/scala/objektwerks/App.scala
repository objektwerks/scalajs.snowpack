package objektwerks

import org.scalajs.dom.document

object App:
  def main(args: Array[String]): Unit =
    val p = document.createElement("p")
    p.textContent = "Scalajs loves Snowpack!"
    document.body.appendChild(p)