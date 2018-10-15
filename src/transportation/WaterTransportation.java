package transportation;

public abstract class WaterTransportation implements Transportation {
   public double displacement;
  public WaterTransportation(double displacement){
    this.displacement = displacement;
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
