package pl.sda.javakrk25.practising.ex_13;

public class Ex_13_vehicle {

    /**
     * 1.Stworzyć klasę Vehicle, która będzie miałą pole speed i maxSpeed oaz konstruktor ustawiający wartość tych pól,
     * oraz getter i setter
     * 2.Stworzyć klasę Car i Bicycle, które rozszerzają klasę Vehicle oraz mają dodatkowe, unikalne dla siebie pola,
     * np. ilość przerzutek, pojemność silnika, etc. Dodaj konstruktor, korzystający z konstruktora klasy bazowej (super())
     * 3. W każdej z klas stwóz metodę toString() która opisuje dany obiekt
     *
     * @param args
     */
    public static void main(String[] args) {
        Vehicle v = new Vehicle(20, 240);
        Vehicle c = new Car(25, 2);
        Vehicle b = new Bicycle(15, 27);

        Vehicle[] vehicles = {v, c, b};

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Samochód, pojemność silnika:" + car.engineVolume);
            }
            if (vehicle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) vehicle;
                System.out.println("Rower, ilość przerzutek:" + bicycle.getGears());
            }
        }
    }
}
