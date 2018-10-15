package transportation;

public abstract class GroundTransportation implements Transportation {
  double length;
  double width;
  double height;
  double mass;
  double volumeEngine;



  public GroundTransportation(double length, double width, double height, double mass, double volumeEngine) {
    this.length = length;
    this.width = width;
    this.height = height;
    this.mass = mass;
    this.volumeEngine = volumeEngine;
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
