package clicker

import java.awt._
import java.awt.event.InputEvent

trait FakeMovement {
  private val bot = new Robot()
  def leftMouseClick() = {
    bot.mousePress(InputEvent.BUTTON1_MASK)
    bot.mouseRelease(InputEvent.BUTTON1_MASK)
  }
  def f1() = {
    robot.keyPress(KeyEvent.VK_F1);
    robot.keyRelease(KeyEvent.VK_F1);
  }
  def f2() = {
    robot.keyPress(KeyEvent.VK_F2);
    robot.keyRelease(KeyEvent.VK_F2);
  }
  def f3() = {
    robot.keyPress(KeyEvent.VK_F3);
    robot.keyRelease(KeyEvent.VK_F3);
  }
  def f4() = {
    robot.keyPress(KeyEvent.VK_F4);
    robot.keyRelease(KeyEvent.VK_F4);
  }
  def f5() = {
    robot.keyPress(KeyEvent.VK_F5);
    robot.keyRelease(KeyEvent.VK_F5);
  }
  def f6() = {
    robot.keyPress(KeyEvent.VK_F6);
    robot.keyRelease(KeyEvent.VK_F6);
  }
  def f6() = {
    robot.keyPress(KeyEvent.VK_F6);
    robot.keyRelease(KeyEvent.VK_F6);
  }
  def f7() = {
    robot.keyPress(KeyEvent.VK_F7);
    robot.keyRelease(KeyEvent.VK_F7);
  }
  def f8() = {
    robot.keyPress(KeyEvent.VK_F8);
    robot.keyRelease(KeyEvent.VK_F8);
  }
  def f9() = {
    robot.keyPress(KeyEvent.VK_F9);
    robot.keyRelease(KeyEvent.VK_F9);
  }
  def f10() = {
    robot.keyPress(KeyEvent.VK_F10);
    robot.keyRelease(KeyEvent.VK_F10);
  }
}