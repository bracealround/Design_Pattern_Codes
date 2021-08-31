import java.util.Random;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    int signature;

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public String toString(){
        return "Chocolateboiler " + signature + " " ;
    }

    private static ChocolateBoiler uniqueInstance=null;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        signature=new Random().nextInt(1000000);

        try {
            Thread.sleep(2500);
        }catch (Exception e){}
    }

    public String getStatus(String msg)
    {
        return msg + "<>" + this + "<empty: " + this.empty + " , boiled: " + this.boiled +">";
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println(this + "Filling Chocolate and Milk");
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
        else {
            System.out.println(this +"Can't fill:Boilar not empty");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println(this +"Boiling Chocolate and Milk");
            // bring the contents to a boil
            boiled = true;
        }
        else {
            if(isEmpty()) System.out.println(this +"Can't Boil:Boilar is empty");
            else System.out.println(this +"Can't Boil:Already Boiled");
        }

    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
        else {
            if(isEmpty()) System.out.println(this +"Can't drain:Boilar is empty");
            else System.out.println(this +"Can't Drain:Isn't boiled");

        }
    }



}