/*
    According to the Liskov principle the object of parent
    class should have the same functionality as the Object of the parent class.
 */
class Checker
{
    /*
        In the efficient implementation,the liskov principle is upheld as the in the checker class the object of child class
        Cocacola has the same amount of functionality as the parent template class Software.
     */
    void check(SoftDrinks soft)
    {
        soft.addsugar();
        soft.addwater();
        soft.make_softdrinks();
        soft.add_foodcolor();
        soft.add_sweetnessingredient();
        System.out.println("soft");

    }
    void check(Cocacola coke)
    {
        coke.addsugar();
        coke.addwater();
        coke.make_softdrinks();
        coke.add_sweetnessingredient();
        coke.addacids();
        System.out.println("coke");

    }

    void check(Sevenup sevenup)
    {
        sevenup.addsugar();
        sevenup.addwater();
        sevenup.make_softdrinks();
        sevenup.add_sweetnessingredient();
        sevenup.addacids();
        System.out.println("sevenup");

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Implementation with liskov principle");
        Checker checker=new Checker();
        Cocacola cockacola=new Cocacola();
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

            @Override
            Object add_sweetnessingredient() {
                return null;
            }

            @Override
            int add_foodcolor() {
                return 0;
            }
        };
        checker.check(cockacola);
        checker.check(softDrinks);

    }
}
