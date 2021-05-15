public class GoogleMap implements Observer{
    @Override
    public void update(Subject sub) {
        System.out.println("update called from " + this);
    }

    public String toString(){
        return "Google Map";
    }
}
