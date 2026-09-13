class Number
{
    int n = 7;
}

class Check extends Number
{
    int count = 0;

    void divide()
    {
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                count++;
        }
    }
}

class Prime extends Check
{
    void result()
    {
        divide();

        if(count == 2)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
}

public class Multilevel_inheritance
{
    public static void main(String args[])
    {
        Prime p = new Prime();

        p.result();
    }
}