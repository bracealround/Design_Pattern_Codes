import java.util.Random;

public class All_Rounder implements Cricketer{
    @Override
    public int catches() {
        Random rand=new Random();
        return Math.abs(rand.nextInt());
    }

    @Override
    public String fitnesslevel() {
        return "GOOD";
    }

    @Override
    public boolean is_alrounder() {
        return true;
    }

    @Override
    public int battingpossition() {
        Random rand=new Random();
        int x= rand.nextInt();
        x=x%6;
        if(x<=0)
            x=1;
        return x;
    }
    @Override
    public Integer cumulativerun() {
        Random rand=new Random();
        return rand.nextInt();
    }

    @Override
    public Double battingstrikerate() {
        Random rand=new Random();
        return rand.nextDouble();
    }

    @Override
    public Double battingaverage() {
        Random rand=new Random();
        return rand.nextDouble();
    }
    @Override
    public String battinghand() {
        return "Left";
    }

    @Override
    public String bowlinghand() {
        return "Right";
    }

    @Override
    public String typeofbolwer() {
        return "Left Arm Spinner";
    }

    @Override
    public Double economyrate() {
        Random rand=new Random();
        Double x= rand.nextDouble();
        return x;
    }

    @Override
    public Double blowingaverage() {
        Random rand=new Random();
        Double x= rand.nextDouble();
        return x;
    }

    @Override
    public Double bowlingstrikerate() {
        Random rand=new Random();
        Double x= rand.nextDouble();
        return x;
    }

    public String wicketkippingskill() {
        System.out.println("Not A WicketKepper");
        return null;
    }

    @Override
    public Integer number_of_stumping() {
        System.out.println("Not A WicketKepper");
        return null;
    }
}
