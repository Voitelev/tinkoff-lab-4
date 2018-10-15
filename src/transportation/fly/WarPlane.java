package transportation.fly;

import transportation.FlyTransportation;

public class WarPlane extends FlyTransportation {
  int countAmmunition;

  public WarPlane(double maxSped, int countEngine, int countAmmunition) {
    super(maxSped, countEngine);
    this.countAmmunition = countAmmunition;
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

  public void shot() {
    countAmmunition--;
  }
}
