package clicker

import scala.util._

trait Delay {
  private val random = new Random()
  def prayFlickDelay() = Thread.sleep(900 + random.nextInt(600))
  def teleportDelay() = Thread.sleep(1300 + random.nextInt(200))
  def minuteDelay() = Thread.sleep(50000 + random.nextInt(7000))
}