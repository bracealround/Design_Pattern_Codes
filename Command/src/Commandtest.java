/*
In the client side we present a simple and unified interface.facade means fake apperence .Facade violates open-close principle
as it is static.It will be solved by command pattern.
 */

import java.util.ArrayList;

class Light{
    String name;
    boolean state;
    Light(String name)
    {
        this.name=name;
        state=false;
    }
    void on()
    {
        System.out.println(name+" is on ");
        state=true;
    }
    void off()
    {
        System.out.println(name+" is off ");
        state=false;
    }
}

class Fan{
    String name;
    boolean state;
    Fan(String name)
    {
        this.name=name;
        state=false;
    }
    void start()
    {
        System.out.println(name+" is on ");
        state=true;
    }
    void stop()
    {
        System.out.println(name+" is off ");
        state=false;
    }
}

class Projector{
    String name;
    boolean state;
    Projector(String name)
    {
        this.name=name;
        state=false;
    }
    void start()
    {
        System.out.println(name+" has started ");
        state=true;
    }
    void stop()
    {
        System.out.println(name+" has  shut_down ");
        state=false;
    }
}

class PC{
    String name;
    boolean state;
    PC(String name)
    {
        this.name=name;
        state=false;
    }
    void start()
    {
        System.out.println(name+" started ");
        state=true;
    }
    void stop()
    {
        System.out.println(name+" shut_down ");
        state=false;
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
interface  Command{
    void execute();
}

class NullCommand implements Command{

    @Override
    public void execute() {
        System.out.println("This button has yet to be assigned a valid commnd");
    }
}

class  LightCommand implements  Command{
    Light light;
    LightCommand(Light light)
    {
        this.light=light;
    }
    public void  execute()
    {
        if(!light.state) light.on();
        else light.off();
    }
}

class  FanCommand implements  Command{
    Fan fan;
    FanCommand(Fan fan)
    {
        this.fan=fan;
    }
    public void  execute()
    {
        if(!fan.state) fan.start();
        else fan.stop();
    }
}


class Remote{
    ArrayList<Command> btn_arr= new ArrayList<>();
    Remote(){
        for(int i=0;i<10;i++)
            btn_arr.add(new NullCommand());
    }
    void setCommand(int idx,  Command command)
    {
        btn_arr.set(idx,command);
    }
    void push_button(int idx)
    {
        btn_arr.get(idx).execute();
    }
}
/*
In command_pattern we have 4 parties:
    1.client
    2.waiter->invoker
    3.kitchen_manager->receiver
    4.chef->executor
 */
/*
    In our example:
        client-main_class
        invoker->remote
        receiver->differnt light/fan command class
        executor->light/fan
        but its kind of confusing so better not to dig deep into it.
 */

/*
Flow:
light
Command lightCommand(light.on)
remote
remote(setCommand(LightonCommand)
remote.push_button(execute())
 */
public class Commandtest {
    public static void main(String[] args) {
        System.out.println("Command Pattern");
        Remote remote = new Remote();

        int num_light = 5 ,num_fan=4;
        for(int i=1;i<=num_light;i++)
            remote.setCommand(i,new LightCommand(new Light("Light "+i)));
        for(int i=num_light+1;i<=num_light+num_fan;i++)
            remote.setCommand(i,new FanCommand(new Fan("Fan "+(i-num_light))));

        remote.push_button(7);
    }
}
