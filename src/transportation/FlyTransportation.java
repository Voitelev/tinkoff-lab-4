package transportation;

public abstract class FlyTransportation implements Transportation {
  double maxSped;
  int countEngine;

 public FlyTransportation(double maxSped,
                    int countEngine) {
    this.maxSped = maxSped;
    this.countEngine = countEngine;
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
