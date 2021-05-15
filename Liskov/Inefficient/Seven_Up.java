import java.util.Random;
////Here the child class Seven_Up implements more methods than the template class.
public class Seven_Up extends SoftDrinks{
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
        System.out.println("No Foodcolor added in sevenup");//This is a corner case with cokacola.
        return 0;
    }

    void make_softdrinks()
    {
        super.water=addwater();
        super.sugar=addsugar();
        /*
            Rest of the process of making softdrinks;
         */

    }

    void make_sevenup(){
        add_caramel();
        add_foodcolor();
        addacids();
        make_softdrinks();
        /*
            Rest of the process of making sevenup.
         */
    }
}
