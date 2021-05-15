/*
Strategy pattern mainly says 3 things:
1.code that changes <separate> code that remains same.
(same as open close principal,gives scalability,helps testing,helps keep tested code separated,keep modular part separated.)
2.change code in interface/abstraction
(open close principle example.)(can get behaviour from client)
3.
 */
/*
According to strategy pattern:
Context:Code that does not change.(Google Map)
Behaviour/Strategy:Code that changes frequently.(Route finding:walking,public transport,car)//can be multiple.

 */
/*
Interface Strategy{
    doSomething();
}

class Strl implements STrategy{
    doSomething()
}
Context{
    Strategy stg;
    setStrategy()
    {
    }
}

client{
    Context service
    service.setStrategy();
}
 */
/*
Example:
Calculator will take two numbers and perform some operation.
 */
public class Strategy {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.setOperation(new Add());
        System.out.println(calculator.performOperation(10,20) );
    }
}
