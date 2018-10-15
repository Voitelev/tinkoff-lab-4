package transportation.fly;

import transportation.FlyTransportation;

public class CivilPlane extends FlyTransportation {
  int countPassenger;

  public CivilPlane(double maxSped, int countEngine, int countPassenger) {
    super(maxSped, countEngine);
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
