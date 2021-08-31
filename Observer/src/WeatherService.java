import java.util.Random;

public class WeatherService extends Subject{
    @Override
    void addObserver(Observer ob) {
        this.ob_arr.add(ob);
        System.out.println(ob + "added to" + this+"\n");
    }

    @Override
    void removeObserver(Observer ob) {
        this.ob_arr.remove(ob);
        System.out.println(ob + "removed from " + this+"\n");
    }

    @Override
    void notifyObserver() {
        for(Observer ob:ob_arr)
        {
            ob.update(this);
        }
    }

    int getTemparature()
    {
        Random random = new Random();
        return random.nextInt(50);
    }

    int getPressure()
    {
        Random random = new Random();
        return random.nextInt(50);
    }

    public String toString()
    {
        return "Whether Service";
    }
}
