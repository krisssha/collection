package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;


    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();

    public void addDriver(Driver<?> ... driver) {
        this.drivers.addAll(List.of(driver));
    }

    public void addMechanic(Mechanic<?> ... mechanic) {
        this.mechanics.addAll(List.of(mechanic));
    }

    public void addSponsor(Sponsor ... sponsor) {
        this.sponsors.addAll(List.of(sponsor));
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}