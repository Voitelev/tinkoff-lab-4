package transportation.water;

import transportation.WaterTransportation;

public class SmallShip extends WaterTransportation {
  int countPassenger;
  public SmallShip(double displacement, int countPassenger) {
    super(displacement);
    this.countPassenger = countPassenger;
  }
  @Override
  public void moveLeft() {

  }

  @Override
  public void moveRight() {

  }

  @Override
  public void moveForward() {

  }

  @Override
  public void moveBackward() {

  }
}
