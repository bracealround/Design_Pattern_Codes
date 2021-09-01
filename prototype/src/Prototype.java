/*
    Mustafa game:generalized villain created.copy needed.
    Naive Approach:Take Objects value and create a new object.but private attributes will be unknown.
    principle of least knowledge:to let know what something need to know.
    prototype pattern just means cloning an object.Here the private attributes can be accessed.

 */
/*
interface villainPrototype{
    villainPrototype myclone()
}

abstract class Villain{
    hp,mp;
    abstract void attackprotagonist()

}

class villainType1 extends Villain implements villainPrototype{

}
 */

/*

 */

interface villainPrototype{
    Villain myclone(); //as this is a part of the interface so it has no problem accessing the private parts.
}

abstract class Villain implements villainPrototype{
    abstract void attackprotagonist();

}


class villainType1 extends Villain {
    private int hp,mp;
    villainType1(int hp,int mp) {
        super();
        this.hp=hp;
        this.mp=mp;
    }
    @Override //as this is a part of the interface so it has no problem accessing the private parts.
    public Villain myclone() {
        return new villainType1(this.hp,this.mp);
    }

    @Override
    void attackprotagonist() {
        System.out.println("Attacking Protagonist");
    }

    public String toString() {
        String str = " hp: "+this.hp+" mp: "+this.mp;
        return str;
    }
}
public class Prototype {
    public static void main(String[] args) {

       Villain v=new villainType1(50,150);
        System.out.println(v);

        Villain clone= v.myclone();
        System.out.println(clone);
    }
}
