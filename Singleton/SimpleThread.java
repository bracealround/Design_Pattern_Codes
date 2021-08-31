public class SimpleThread implements Runnable{
    String name;

    SimpleThread(String name){
        this.name=name;
    }
    @Override
    public void run() {
        ChocolateBoiler chocolateBoiler=ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        System.out.println(chocolateBoiler.getStatus(name));
    }
}
