import java.util.Random;

//Here Sevenup is the child class of SoftDrinks which doesn't implement any extra method.
public class Sevenup extends SoftDrinks{
    @Override
    int addsugar() {
        Random rand=new Random();
        return rand.nextInt();
    }

    @Override
    Integer addwater() {

        Random rand=new Random();
        return rand.nextInt();
    }

    Object add_sweetnessingredient()
    {
        Object obj=new Object();
        return obj;
    }

    Object addacids()
    {
        Object obj=new Object();
        return obj;
    }

    int add_foodcolor()
    {
        return 0;
    }

    void make_softdrinks()
    {
        super.water=addwater();
        super.sugar=addsugar();
        add_sweetnessingredient();
        add_foodcolor();
        addacids();
        /*
            Rest of the process of making softdrinks;
         */
    }
}
