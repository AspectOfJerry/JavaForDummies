public class Vehicle {
    private int _fuel;

    public Vehicle(int fuel, int doorCount) {
        this._fuel = fuel;
    }

    public int getFuel() {
        return _fuel;
    }

    public void changeFuel(int fuel) {
        this._fuel = fuel;
    }
}
