import java.util.Random;

public class Wicket_Kepper implements Cricketer{
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
        return "Right";
    }

    @Override
    public String bowlinghand() {
        return "Not Applicable for a Kepper";
    }

    @Override
    public String typeofbolwer() {
        return "Not Applicable for a Kepper";
    }

    @Override
    public Double economyrate() {
        System.out.println("Not Applicable for a Kepper");
        return null;
    }

    @Override
    public Double blowingaverage() {
        System.out.println("Not Applicable for a Kepper");
        return null;
    }

    @Override
    public Double bowlingstrikerate() {
        System.out.println("Not Applicable for a Kepper");
        return null;
    }

    @Override
    public Integer number_of_stumping() {
        Random rand=new Random();
        return rand.nextInt();
    }

    @Override
    public String wicketkippingskill() {
        return "GOOD";
    }
}
