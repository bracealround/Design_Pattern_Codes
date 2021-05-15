import java.util.Random;

public class Bowler implements Cricketer{
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
        return false;
    }

    @Override
    public int battingpossition() {
        Random rand=new Random();
        int x= rand.nextInt();
        x=x%11;
        if(x<=6)
            x=11;
        return x;
    }

    @Override
    public Integer cumulativerun() {
        System.out.println("Not Necessary For a Bowler");
        return null;
    }

    @Override
    public Double battingstrikerate() {
        System.out.println("Not Necessary For a Bowler");
        return null;
    }

    @Override
    public Double battingaverage() {
        System.out.println("Not Necessary For a Bowler");
        return null;
    }

    @Override
    public String battinghand() {
        System.out.println("Not Necessary For a Bowler");
        return null;
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

    @Override
    public String wicketkippingskill() {
        System.out.println("Not Applicable For a Bowler");
        return null;
    }

    @Override
    public Integer number_of_stumping() {
        System.out.println("Not Applicable For a Bowler");
        return null;
    }
}
