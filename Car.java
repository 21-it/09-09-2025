public class Car {
    int numDoors;
    boolean isElectric;

    // Constructor
    public Car() {
        numDoors = 4;
        isElectric = false;
    }

    public Car(int numDoors, boolean isElectric) {
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }
    //getter
    //setter
    //method
    public void print() {
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Is Electric: " + isElectric);
        
    }
}
