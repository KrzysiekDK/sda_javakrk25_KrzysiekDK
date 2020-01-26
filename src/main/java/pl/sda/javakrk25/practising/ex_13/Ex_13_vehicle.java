package pl.sda.javakrk25.practising.ex_13;

public class Ex_13_vehicle {

    /**
     * 1.Stworzyć klasę Vehicle, która będzie miałą pole speed i maxSpeed oaz konstruktor ustawiający wartość tych pól,
     * oraz getter i setter
     * 2.Stworzyć klasę Car i Bicycle, które rozszerzają klasę Vehicle oraz mają dodatkowe, unikalne dla siebie pola,
     * np. ilość przerzutek, pojemność silnika, etc. Dodaj konstruktor, korzystający z konstruktora klasy bazowej (super())
     *
     * @param args
     */
    public static void main(String[] args) {
        Vehicle v = new Vehicle(20, 240);
        Car c = new Car(25, 2);
        System.out.println(c);
    }
}
