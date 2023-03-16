public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Car myCar = new Car(57, 1, 4);

        System.out.println(myCar.getVersion());

        myCar.changeVersion(2);

        System.out.println(myCar.getVersion());
    }
}
