public class WeatherService extends Subject{
    @Override
    void addObserver(Observer ob) {
        this.ob_arr.add(ob);
        System.out.println(ob + "added to" + this);
    }

    @Override
    void removeObserver(Observer ob) {
        this.ob_arr.remove(ob);
        System.out.println(ob + "removed from" + this);
    }

    @Override
    void notifyObserver() {
        for(Observer ob:ob_arr)
        {
            ob.update(this);
        }
    }

    public String toString()
    {
        return "Whether Service";
    }
}
