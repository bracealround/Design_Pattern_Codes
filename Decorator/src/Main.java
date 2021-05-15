/*
Coffeshop
COfffetype:
DarkRoast,Houseblend,Decaf,Expresso
Accessories:Milk,Sugar,Sweetnut,Mocha,(Oreo added later)=>Condiments


User will see the current price and current stage of the coffee at every satge.
*SHould maintain previous priciplpes as much as possible.
 */
/*
abstract Base Item:
    getDescription()
    getcost()

Item extends BaseItem
    getDescription()
    getcost()

abstract BaseDecorator extends BaseItem
    BaseItem obj //Reference of base item

Decorator1 extends BaseDecorator
    getDescription()
    getcost()

//As we are wrapping the baseitem with the decorator it is known as wrapper pattern also.

 */
/*
The toString() method returns the string representation of the object.
If you print any object, java compiler internally invokes the toString() method on the object.
So overriding the toString() method, returns the desired output, it can be the state of an object etc.
 */
abstract class Coffee{
    abstract public String toString();
    abstract int getcost();
}

class DarkRoast extends Coffee{
    @Override
    public String toString() {
        return "Finest DarkRoast";
    }

    @Override
    int getcost() {
        return 100;
    }
}

class HouseBlend extends Coffee{
    @Override
    public String toString() {
        return "Finest HouseBlend";
    }

    @Override
    int getcost() {
        return 120;
    }
}

abstract class Condinents extends Coffee{
    Coffee coffee;
}

class SweetNuts extends Condinents{
    SweetNuts(Coffee coffee)
    {
        this.coffee=coffee;
    }

    @Override
    public String toString() {
        return coffee+",Sweetnut";
    }

    @Override
    int getcost() {
        return coffee.getcost()+30;
    }
}

class Chocolate extends Condinents{
    Chocolate(Coffee coffee)
    {
        this.coffee=coffee;
    }

    @Override
    public String toString() {
        return coffee+",Chocolate";
    }

    @Override
    int getcost() {
        return coffee.getcost()+50;
    }
}


public class Main {
    public static void main(String[] args) {
        Coffee coffee = new DarkRoast();
        System.out.println(coffee+" "+coffee.getcost());

        coffee = new SweetNuts(coffee);
        System.out.println(coffee+",cost: "+coffee.getcost());

        coffee = new Chocolate(coffee);
        System.out.println(coffee+",cost: "+coffee.getcost());


        Coffee coffee2 = new HouseBlend();
        System.out.println(coffee2 +" "+coffee2.getcost());

        coffee2 = new SweetNuts(coffee2);
        System.out.println(coffee2+",cost: "+coffee2.getcost());

        coffee2 = new Chocolate(coffee2);
        System.out.println(coffee2+",cost: "+coffee2.getcost());

    }
}
