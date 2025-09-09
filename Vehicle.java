public class Vehicle {
    // Property class
    String merk;
    int milesPerGallon;

    //Constructor
    public Vehicle() {
        merk = "Toyota";
        milesPerGallon = 2;
    }
    public Vehicle(String merk, int milesPerGallon) {
        this.merk = merk;
        this.milesPerGallon = milesPerGallon;
    }
    //getter
    //setter
    //method
    public void print() {
        System.out.println("Merk: " + merk);
        System.out.println("Miles Per Gallon: " + milesPerGallon);
    }
}