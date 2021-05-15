import java.util.Random;

//As Batsman is also a cricketer two interface Cricketer and Batsman are implemented.

public class Batsman implements Cricketer,Batting{
    @Override
    public int catches() {
        Random rand=new Random();
        return rand.nextInt(350);
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
        int x= rand.nextInt(11);
        if(x==0)
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
}
