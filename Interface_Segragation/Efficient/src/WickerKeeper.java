import java.util.Random;

//Here we are focussing on keeping skill.So,only Cricketer And Wicketkeeping interface are implemented.

public class WickerKeeper implements Cricketer,Wicketkeeping{
    @Override
    public int catches() {
        Random rand=new Random();
        return Math.abs(rand.nextInt(350));
    }

    @Override
    public String fitnesslevel() {
        return "GOOD";
    }

    @Override
    public boolean is_alrounder() {
        return false;
    }

    @Override
    public Integer number_of_stumping() {
        Random rand=new Random();
        return rand.nextInt(350);
    }

    @Override
    public String wicketkippingskill() {
        return "GOOD";
    }

}
