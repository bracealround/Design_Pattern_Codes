/*
In the client side we present a simple and unified interface.facade means fake apperence .Facade violates open-close principle
as it is static.It will be solved by command pattern.
 */

import java.util.ArrayList;

class Light{
    String name;
    Light(String name)
    {
        this.name=name;
    }
    void on()
    {
        System.out.println(name+" is on ");
    }
    void off()
    {
        System.out.println(name+" is off ");
    }
}

class Fan{
    String name;
    Fan(String name)
    {
        this.name=name;
    }
    void start()
    {
        System.out.println(name+" is on ");
    }
    void stop()
    {
        System.out.println(name+" is off ");
    }
}

class Projector{
    String name;
    Projector(String name)
    {
        this.name=name;
    }
    void start()
    {
        System.out.println(name+" has started ");
    }
    void stop()
    {
        System.out.println(name+" has  shut_down ");
    }
}

class PC{
    String name;
    PC(String name)
    {
        this.name=name;
    }
    void start()
    {
        System.out.println(name+" started ");
    }
    void stop()
    {
        System.out.println(name+" shut_down ");
    }
}

class Facade{
    ArrayList<Light> lightArrayList = new ArrayList<>();
    ArrayList<Fan> fanArrayList = new ArrayList<>();
    Projector projector;
    ArrayList<PC> pcArrayList = new ArrayList<>();

    void addlight(Light light)
    {
        lightArrayList.add(light);
    }

    void addfan(Fan fan)
    {
        fanArrayList.add(fan);
    }

    void setProjector(Projector projector)
    {
        this.projector=projector;
    }

    void addpc(PC pc)
    {
        pcArrayList.add(pc);
    }

    void start()
    {
        for(Light light: lightArrayList) light.on();
        for(Fan fan: fanArrayList) fan.start();
        projector.start();
        for(PC pc: pcArrayList) pc.start();
    }
    void stop()
    {
        for(Light light: lightArrayList) light.off();
        for(Fan fan: fanArrayList) fan.stop();
        projector.stop();
        for(PC pc: pcArrayList) pc.stop();
    }
}
public class Facadetest {
    public static void main(String[] args) {
        System.out.println("Facade");

        Facade facade =new Facade();
        facade.addlight(new Light("light 1"));
        facade.addlight(new Light("light 2"));

        facade.addfan(new Fan("fan 1"));
        facade.addfan(new Fan("fan 2"));

        facade.setProjector(new Projector("Projector 1"));

        facade.addpc(new PC("pc 1"));
        facade.addpc(new PC("pc 2"));


        facade.start();
        facade.stop();
    }
}
