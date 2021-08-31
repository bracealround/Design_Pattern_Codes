/*
weather service=>JSON(Temparature,Pressure)
Accweather=>XML(Humidity)
Will gather humidity data from accweather and return it as JSON format.This is adapting.

 */

/*
Use data from Bike to Car in same format.Adapter class will try to adapt info from bike to car.Here user interface will show
the same format for car and bike and the adapter will handle everything.
 */
abstract class Car{
    double weight_kg;
    double milage;
    Car(double weight_kg, double milage)
    {
        this.milage=milage;
        this.weight_kg=weight_kg;
    }
    abstract void start();
    abstract void steer(int left_right);
}

class Mclaern extends Car{

    Mclaern() {
        super(1500,30);
    }

    @Override
    void start() {
        System.out.println("Mclaren is starting");
    }

    @Override
    void steer(int left_right) {
        System.out.println("Steering" + left_right);
    }
}

abstract class Bike{
    double weight_pound;
    double kilometer_per_litre;
    Bike(double weight_pound, double kilometer_per_litre){
        this.kilometer_per_litre=kilometer_per_litre;
        this.weight_pound=weight_pound;

    }
    abstract void begin();
    abstract void control(int left_right);
}

class Suzuki extends Bike{

    Suzuki() {
        super(2000.52,110.50);
    }

    @Override
    void begin() {
        System.out.println("Suzuki is beginning");
    }

    @Override
    void control(int left_right) {
        System.out.println("Controlling " + left_right);
    }
}

class Bike2CarAdapter extends Car{
    Bike bike;
    Bike2CarAdapter(Bike bike) {
        super(bike.weight_pound/2.20462,bike.kilometer_per_litre*0.621371 );
        this.bike=bike;
    }

    @Override
    void start() {
        bike.begin();
    }

    @Override
    void steer(int left_right) {
        bike.control(left_right);
        return;
    }
}

public class Adapter {
    public static void main(String[] args) {
        System.out.println("Adapter Pattern");

        Car mclaren=new Mclaern();
        Car suzuki=new Bike2CarAdapter(new Suzuki());

        mclaren.start();
        mclaren.steer(1);

        suzuki.start();
        suzuki.steer(2);
    }
}
