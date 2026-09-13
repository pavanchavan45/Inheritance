class Input
{
    protected int X,Y;

    public Input(int X,int Y)
    {
        this.X = X;
        this.Y = Y;
    }
}

class Addition extends Input
{
    public Addition(int a,int b)
    {
        super(a,b);
    }

    public void add()
    {
        System.out.println("Addition is " + (X + Y));
    }
}

public class HierarchicalConstructor
{
    public static void main(String[] args)
    {
        Addition obj = new Addition(5,7);
        obj.add();
    }
}