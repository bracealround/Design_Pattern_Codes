/*
    for shared resource sometimes we dont want more than one object.
 */

/*
Aim is to not to give permission to create second instance of chocolate boilar.here we will create a public static function so that
create an object if it is called the first time.Otherwise it will return the previously created object.

When using thread and wait another thread may enter before first thread completion and thus create another instance.to solve
this we should add synchronized before the requred functions(not implemented here,but is in the video)

But synchronized method is not optimized as it locks the whole class.so lock(block) is more optimized than sunchronized method.
 */
public class Singleton {
    public static void main(String[] args) {
        /*ChocolateBoiler chocolateBoiler =ChocolateBoiler.getInstance();

        chocolateBoiler.boil();

        chocolateBoiler.fill();
        chocolateBoiler.fill();

        ChocolateBoiler chocolateBoiler2 =ChocolateBoiler.getInstance();

        chocolateBoiler.drain();

        chocolateBoiler.boil();*/
        Thread thread1 =new Thread(new SimpleThread("thread1"));
        Thread thread2 =new Thread(new SimpleThread("thread2"));

        thread1.start();
        thread2.start();
    }
}
