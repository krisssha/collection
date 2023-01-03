package driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String name, boolean driversLicense, int experience, String category) throws IllegalAccessException {
        super(name, driversLicense, experience, category);
    }


    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getName() + " заправляет грузовик " + transport.getBrand());
    }
}
