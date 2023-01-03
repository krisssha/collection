package transport;

public class Car extends Transport implements Competing{


    public Car(String brand, String model, double engineVolume, bodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType= bodyType;
    }

    public transport.bodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(transport.bodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + getBrand() + " "+ getModel()+ " начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + getBrand() + " "+ getModel()+ " окончил движение.");
    }

    @Override
    public void printType() {
        if (bodyType==null){
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println(bodyType);
        }
    }


    @Override
    public boolean service() {
        System.out.println();
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль" + getBrand() + " "+ getModel() + " починена!");
    }

    @Override
    public void pitstop() {
        System.out.println("Автомобиль прошел питстоп.");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*5);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*220);
    }
    private bodyType bodyType;
}

