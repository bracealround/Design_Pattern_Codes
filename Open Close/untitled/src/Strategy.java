/*
    #1.codes that changes needs to be kept separate codes that does not change.(similar to open close.We get benefit in testing.
    Tested code should be tempered as less frequently as possible.)

    #2.change=>interface or abstract class.
 */

/*
    Strategy Pattern formal defination.

    context:codes that doesn't change.(For code: google map)
    strategy/behaviour:codes that does change.(Root finding,distance:Walking,transport,car/bike)

 */
/*
//Generic structure of strategy pattern
interface Strategy{
    something()
}

class strl implements strategy{
    something()
}

Context{
    Strategy stg
    setstrategy()
}

Client
{
    Context service
    service.setstrategy()
}

 */
/*
calculator will take two input(context) and do something(behaviour)
 */
interface Operation{
    int performOperation(int num1,int num2);
}

class Add implements Operation{
    @Override
    public int performOperation(int num1, int num2) {
        return num1+num2;
    }
}

class Calculator{
    Operation op;
    int performOperation(int num1,int num2)
    {
        return op.performOperation(num1, num2);
    }
    void setperformOperation(Operation op)
    {
        this.op=op;
    }

}
public class Strategy {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.setperformOperation(new Add());
        System.out.println(calculator.performOperation(10,20));

    }
}
