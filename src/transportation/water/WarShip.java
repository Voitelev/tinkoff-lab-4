package transportation.water;

import transportation.WaterTransportation;

public class WarShip extends WaterTransportation {
  int countAmmunition;
  public WarShip(double displacement, int countAmmunition) {
    super(displacement);
    this.countAmmunition = countAmmunition;
  }
  class aircraftCarrier extends WaterTransportation{
    int contPlane;
    public aircraftCarrier(double displacement, int contPlane) {
      super(displacement);
      this.contPlane = contPlane;
    }
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
