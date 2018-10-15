package transportation.water;

import transportation.WaterTransportation;

public class CivilShip extends WaterTransportation {
  int countDeck;
  public CivilShip(double displacement, int countDeck) {
    super(displacement);
    this.countDeck = countDeck;
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
