import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Mechanic<Car> ivan = new Mechanic<Car>("Иван", "Иванов", "Нео");
        Mechanic<Car> evgenia = new Mechanic<Car>("Женя", "Иванов", "Нео");
        Sponsor gazprom = new Sponsor("Газпром", 10000000);
        Mechanic<Bus> stepan = new Mechanic<>("Степан", "Петров", "Ромашка");

        Car lada = new Car("Lada", "Granta", 1.7, bodyType.SEDAN);
        lada.addDriver(new DriverB("Andrey", true, 5, "c"));
        lada.addMechanic(ivan);
        lada.addSponsor(gazprom);
        Car audi = new Car("Audi", "A8", 3.0, bodyType.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0, bodyType.SEDAN);
        Car kia = new Car("Kia", "Sportage", 2.4, bodyType.CROSSOVER);
        Bus mercedes = new Bus("Mercedes", "conecto", 6.0, capacityType.AVERAGE);
        mercedes.addDriver(new DriverC("Mihail", true, 23, "b"));
        mercedes.addMechanic(stepan);
        mercedes.addSponsor(gazprom);
        Bus mercedes2 = new Bus("Mercedes", "ecirato", 5.0, capacityType.AVERAGE);
        Bus paz = new Bus("ПАЗ", "3205", 4.5, capacityType.BIG);
        Bus baz = new Bus("БАЗ", "2215", 4.5, capacityType.EXTRA_LARG);
        Truck gaz = new Truck("ГАЗ", "7878", 6.2, loadType.N2);
        Truck isuzu = new Truck("ISUZU", "00", 6.2, loadType.N3);
        Truck fuso = new Truck("FUSO", "86", 7.1, loadType.N1);
        Truck kamaz = new Truck("КамАЗ", "0989", 8.2, loadType.N2);

        lada.start();
        gaz.stop();
        isuzu.pitstop();


        DriverD vasiliy = new DriverD("Vasiliy", true, 10, "d");


        List<Transport> transports = Arrays.asList(lada, lada, audi, bmw, kia,
                mercedes2, mercedes, paz, baz,
                gaz, isuzu, fuso, kamaz);

        Set<Transport> transportSet = new HashSet<>(transports);

        for (Transport transport : transports) {
            System.out.println("__________________________________________list");
            printInfo(transport);
        }


        for (Transport transport : transportSet) {
            System.out.println("__________________________________________set");
            printInfo(transport);
        }


        Map<Transport, Mechanic<? extends Transport>> mechanicMap = new HashMap<>();
        mechanicMap.put(lada, ivan);
        mechanicMap.put(lada, evgenia);
        mechanicMap.put(mercedes, stepan);

        System.out.println("___________-mechanicMap______ " + mechanicMap.get(lada).getName());

        System.out.println("___________-mechanicMap______ " + mechanicMap.get(mercedes).getName());
    }

    private static void printInfo(Transport transport) {
        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel());
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println("Водители : " + driver.getName());
        }
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println("Механики : " + mechanic.getName());
        }
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println("Спонсоры : " + sponsor.getName());
        }
    }
}




