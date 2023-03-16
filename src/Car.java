public class Car extends Vehicle {
    private int _version;

    public Car(int fuel, int version, int doorCount) {
        super(fuel, doorCount);
        this._version = version;
    }

    public int getVersion() {
        return _version;
    }

    public void changeVersion(int version) {
        this._version = version;
    }
}
