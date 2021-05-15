import java.util.ArrayList;

public abstract class Subject {

    ArrayList<Observer>ob_arr=new ArrayList<>();//interface cant instantiate something.


    abstract void addObserver(Observer ob);
    abstract void removeObserver(Observer ob);
    abstract void notifyObserver();

}