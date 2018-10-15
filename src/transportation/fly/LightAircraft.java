package transportation.fly;

import transportation.FlyTransportation;

public class LightAircraft extends FlyTransportation {
  double countChemicals;

  public LightAircraft(double maxSped, int countEngine, double countChemicals) {
    super(maxSped, countEngine);
    this.countChemicals = countChemicals;
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

  public void sprayingChemicals() {

  }
}
