package transportation.ground;

import transportation.GroundTransportation;

public class Truck extends GroundTransportation {
  public double loadCapacity;

  Truck(double loadCapacity, double length,
        double width,
        double height,
        double mass,
        double volumeEngine) {
    super(length, width, height, mass, volumeEngine);
    this.loadCapacity = loadCapacity;

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

  public void loadCargo() {

  }
}
