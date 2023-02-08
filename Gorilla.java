public class Gorilla extends Mammal {

  public void throwSomething() {
    System.out.printf("Gorilla has thrown something! %n");
    setEnergyLevel(getEnergyLevel() - 5);
    System.out.println(getEnergyLevel());
  }

  public void eatBananas() {
    System.out.printf("Gorilla eats a banana and wants to high five! %n");
    setEnergyLevel(getEnergyLevel() + 10); 
    System.out.println(getEnergyLevel());   
  }

  public void climb() {
    System.out.printf("Gorilla has climbed a tree. %n");    
    setEnergyLevel(getEnergyLevel() - 10);
    System.out.println(getEnergyLevel());
  }

}
