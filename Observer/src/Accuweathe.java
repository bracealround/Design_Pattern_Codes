public class Accuweathe implements Observer{
    @Override
    public void update(Subject sub) {
        System.out.println("update called from " + this + "\n");
    }

    public String toString(){
        return "Accuweather ";
    }
}
