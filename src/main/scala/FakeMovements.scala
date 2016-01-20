package clicker

import java.awt._
import java.awt.event.InputEvent

trait FakeMouse {
  private val bot = new Robot()
  def leftMouseClick() = {
    bot.mousePress(InputEvent.BUTTON1_MASK)
    bot.mouseRelease(InputEvent.BUTTON1_MASK)
  }
}