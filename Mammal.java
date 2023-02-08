public class Mammal{
  private double energyLevel = 300;

  public double displayEnergy() {
    System.out.println(this.getEnergyLevel()); 
    return this.getEnergyLevel();
  }

  public double getEnergyLevel() {
    return this.energyLevel;
  }

  public void setEnergyLevel(double energyLevel) {
    this.energyLevel = energyLevel;
  }


}