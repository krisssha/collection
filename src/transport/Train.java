package transport;

public class Train extends Transport {
    public Train(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void printType() {

    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("a");//TODO
    }
}
 /*   private int price;
    private double time;
    private String startingStationName;
    private String lastStop;
    private int wagons;

    public Train(String brand, String model, int year, String country,int maxSpeed, String startingStationName ,
                 String lastStop, int price, int wagons) {
        super(brand,model,year,country,maxSpeed);
        this.price = price;
        this.startingStationName = startingStationName;
        this.lastStop = lastStop;
        this.wagons = wagons;
    }
    public Train(String brand, String model, int year, String country,int maxSpeed, String startingStationName ,
                 String lastStop, int price, int wagons, String fuel, double fuelPercentage) {
        super(brand,model,year,country,maxSpeed, fuel, fuelPercentage);
        this.price = price;
        this.startingStationName = startingStationName;
        this.lastStop = lastStop;
        this.wagons = wagons;

    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0 ){
            price = 100;
        }
        this.price = price;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        if (time < 0){
            time = 0.0;
        }
        this.time = time;
    }

    public String getStartingStationName() {
        return startingStationName;
    }

    public void setStartingStationName(String startingStationName) {
        if (startingStationName == null || startingStationName.isEmpty() || startingStationName.isBlank()){
            startingStationName = "Станция указана неверно!";
        }
        this.startingStationName = startingStationName;
    }

    public String getLastStop() {
        return lastStop;
    }

    public void setLastStop(String lastStop) {
        if (startingStationName == null || startingStationName.isEmpty() || startingStationName.isBlank()){
            startingStationName = "Станция указана неверно!";
        }
        this.lastStop = lastStop;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        if (wagons < 1){
            wagons = 1;
        }
        this.wagons = wagons;
    }
    public void refill() {
        System.out.println("поезд заправлен топливом" + getFuel());
        setFuelPercentage(100);
    }

    public String toString () {
        return "Поезд " + getBrand() + " модель " + getModel() + " " + getYear() + " год выпуска" + getYear() + " в "+
                getCountry() + " скорость передвижения " + getMaxSpeed() + " км/ч, " + "отходит от " + startingStationName +
                " и следует до станции " + lastStop + "." + " Цена поездки : " + price + " рублей, в поезде" +
                wagons + " вагонов" + "; вид топлива: "+ getFuel() + " на " + getFuelPercentage()
                + " %";
    }
}
*/