package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume, capacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public transport.capacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(transport.capacityType capacityType) {
        this.capacityType = capacityType;
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " "+ getModel()+ " начал движение.");

    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " "+ getModel()+ " окончил движение.");
    }

    @Override
    public void printType() {
        if(capacityType==null){
            System.out.println("данных недостаточно");
        } else {
            System.out.println(capacityType);
        }
    }
    public void repair() {
        System.out.println("Автобус " + getBrand() + " "+ getModel() + " починен!");
    }



    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public void pitstop() {
        System.out.println("Автобус прошел питстоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*10);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*100);
    }
    private capacityType capacityType;



}
