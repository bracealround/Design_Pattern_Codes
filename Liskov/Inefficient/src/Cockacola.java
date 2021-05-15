import java.util.Random;

//Here the child class Cockacola implements more methods than the template class.
public class Cockacola extends SoftDrinks{
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

    Object add_caramel()
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
        Random rand=new Random();
        return rand.nextInt();
    }

    void make_softdrinks()
    {
        super.water=addwater();
        super.sugar=addsugar();
        /*
            Rest of the process of making softdrinks;
         */

    }

    void make_cocakola(){
        add_caramel();
        add_foodcolor();
        addacids();
        make_softdrinks();
        /*
            Rest of the process of making cocacola.
         */
    }
}
