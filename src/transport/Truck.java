package transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume, loadType loadType) {
        super(brand, model, engineVolume);
        this.loadType = loadType;
    }

    public transport.loadType getLoadType() {
        return loadType;
    }

    public void setLoadType(transport.loadType loadType) {
        this.loadType = loadType;
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + getBrand() + " "+ getModel()+ " начал движение.");

    }

    @Override
    public void stop() {
        System.out.println("Грузовик " + getBrand() + " "+ getModel()+ " окончил движение.");

    }

    @Override
    public void printType() {
        if (loadType==null){
            System.out.println("данных недостаточно");
        }
        else {
            System.out.println(loadType);
        }
    }

    public void repair() {
        System.out.println("Грузовик " + getBrand() + " "+ getModel() + " починен!");
    }



    @Override
    public boolean service() {
       return Math.random() > 0.5;
    }

    @Override
    public void pitstop() {
        System.out.println("Грузовик прошел питстоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*9);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*160);
    }
    private loadType loadType;
}
