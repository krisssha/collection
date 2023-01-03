package driver;

import transport.Transport;


public abstract class Driver<T extends Transport> {
    private final String name;
    private boolean driversLicense;
    private int experience;
    private  String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws IllegalAccessException {
        if (category == null) {
            throw new IllegalAccessException("Необходимо указать категорию прав!");
        }
        this.category = category;
    }

    public Driver(String name, boolean driversLicense, int experience, String category) throws IllegalAccessException {
        this.name = name;
        this.driversLicense = driversLicense;
        this.experience = experience;
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public abstract void startMove(T transport);
    public abstract void stopMove(T transport);
    public abstract void refill(T transport);

    public void printInfo(T transport) {
        System.out.println("водитель "+name+" управляет автомобилем "+transport.getBrand()+" и будет участвовать в заезде");
    }
}
