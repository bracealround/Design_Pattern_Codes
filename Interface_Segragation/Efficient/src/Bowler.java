import java.util.Random;


//As Bowler is also a cricketer two interface Cricketer and Bowler are implemented.

public class Bowler implements Cricketer,Bowling{
    @Override
    public int catches() {
        Random rand=new Random();
        return Math.abs(rand.nextInt(600));
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
    public String bowlinghand() {
        return "Left";
    }

    @Override
    public String typeofbolwer() {
        return "Left Arm Off Break";
    }

    @Override
    public Double economyrate() {
        Random rand=new Random();
        Double x= Math.abs(rand.nextDouble());
        return x;
    }

    @Override
    public Double blowingaverage() {
        Random rand=new Random();
        Double x= Math.abs(rand.nextDouble());
        return x;
    }

    @Override
    public Double bowlingstrikerate() {
        Random rand=new Random();
        Double x= Math.abs(rand.nextDouble());
        return x;
    }
}
