/*
    According to the Liskov principle the object of parent
    class should have the same functionality as the Object of the parent class.
*/
class Checker
{
    /*
        Here the object of the parent class SoftDrinks can only access 3 methods whereas
        the object of the child class Cockacola can access 6 methods.
     */
    void check(SoftDrinks soft)
    {
        soft.addsugar();
        soft.addwater();
        soft.make_softdrinks();
        System.out.println("soft object");
        //soft can only get 3 method
    }
    void check(Cockacola coke)
    {
        coke.addsugar();
        coke.addwater();
        coke.make_softdrinks();
        coke.add_caramel();
        coke.addacids();
        coke.make_cocakola();
        System.out.println("coke object");
        //Here coke can  access 6 methods which is more than template class SoftDrinks.So This doesn't abide by Liskov principle.
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Implementation without liskov principle");
        Checker checker=new Checker();
        Cockacola cockacola=new Cockacola();
        SoftDrinks softDrinks=new SoftDrinks() {
            @Override
            int addsugar() {
                return 0;
            }

            @Override
            Integer addwater() {
                return null;
            }

            @Override
            void make_softdrinks() {

            }
        };
        checker.check(cockacola);
        checker.check(softDrinks);
    }
}
