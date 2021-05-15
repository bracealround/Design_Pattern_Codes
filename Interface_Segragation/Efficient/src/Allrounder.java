import java.util.Random;

//As Allrounder is a cricketer,batsman and a bowler three interface Cricketer ,Batsman and Bowler are implemented.
public class Allrounder implements Cricketer,Batting,Bowling{
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
        return true;
    }

    @Override
    public int battingpossition() {
        Random rand=new Random();
        int x= rand.nextInt(11);
        x=x%6;
        if(x<=0)
            x=1;
        return x;
    }
    @Override
    public Integer cumulativerun() {
        Random rand=new Random();
        return rand.nextInt(20000);
    }

    @Override
    public Double battingstrikerate() {
        Random rand=new Random();
        return Math.abs(rand.nextDouble());
    }

    @Override
    public Double battingaverage() {
        Random rand=new Random();
        return Math.abs(rand.nextDouble());
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
