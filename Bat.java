public class Bat extends Mammal {

  public void fly() {
    System.out.printf("Bat flies in silence %n");
    setEnergyLevel(getEnergyLevel() - 50);
    System.out.println(getEnergyLevel());
  }
  
  public void eatHumans() {
    System.out.printf("Bat channels inner Vampire. %n");
    setEnergyLevel(getEnergyLevel() + 25);
    System.out.println(getEnergyLevel());  
  }

  public void attackTown() {
    System.out.printf("The town burns, the children scream. %n");
    setEnergyLevel(getEnergyLevel() - 100);
    System.out.println(getEnergyLevel());
    
  }

}
