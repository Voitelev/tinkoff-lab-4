package transportation.ground;

import transportation.GroundTransportation;

public class Auto extends GroundTransportation {
  int horsepower;

  public Auto(double length, double width, double height, double mass, double volumeEngine, int horsepower) {
    super(length, width, height, mass, volumeEngine);
    this.horsepower = horsepower;
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
