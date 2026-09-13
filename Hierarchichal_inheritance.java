class Number
{
    int n = 153;
}

class Armstrong extends Number
{
    void checkArmstrong()
    {
        int temp = n;
        int sum = 0;

        while(temp > 0)
        {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }

        if(sum == n)
            System.out.println(n + " is Armstrong");
        else
            System.out.println(n + " is Not Armstrong");
    }
}

class Perfect extends Number
{
    void checkPerfect()
    {
        int sum = 0;

        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
                sum = sum + i;
        }

        if(sum == n)
            System.out.println(n + " is Perfect");
        else
            System.out.println(n + " is Not Perfect");
    }
}

public class Hierarchichal_inheritance
{
    public static void main(String args[])
    {
        Armstrong a = new Armstrong();

        a.checkArmstrong();

        Perfect p = new Perfect();

        p.checkPerfect();
    }
}