package transportation.ground;

import transportation.GroundTransportation;

public class Motorcycle extends GroundTransportation {
  String typeMotorcycle;

  public Motorcycle(double length, double width, double height, double mass, double volumeEngine,String typeMotorcycle) {
    super(length, width, height, mass, volumeEngine);
    this.typeMotorcycle = typeMotorcycle;
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
  public void standUp(){

  }
}
