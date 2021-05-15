public class Calculator {
    Operation op;
    int performOperation(int num1,int num2)
    {
        return op.performOperation(num1,num2);
    }
    void setOperation(Operation op)
    {
        this.op=op;
    }
}
