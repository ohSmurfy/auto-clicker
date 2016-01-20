package clicker

object PrayerFlickMouse extends App
  with FakeMovement
  with Delay {
  while (true) {
    leftMouseClick()
    prayFlickDelay()
    leftMouseClick()
    minuteDelay()
  }
}

object TeleportMouse extends App
  with FakeMovement
  with Delay {
  while (true) {
    leftMouseClick()
    teleportDelay()
  }
}
