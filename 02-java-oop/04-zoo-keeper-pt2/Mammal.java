//Create a Mammal class that has an energyLevel and displayEnergy() method. 
//The displayEnergy() method should show the animals energy level as well as return it.

public class Mammal {
    
    protected int energyLevel;

    public Mammal() {
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy: " + this.energyLevel);
        return this.energyLevel;
    }
}
