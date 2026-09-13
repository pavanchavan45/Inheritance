class Greater
{
    public int findGreater(int x,int y)
    {
        if(x > y)
        {
            return x;
        }
        return y;
    }


    public int findGreater(int x,int y,int z)
    {
        if(x > y && x > z)
        {
            return x;
        }
        else if(y > x && y > z)
        {
            return y;
        }
        else
        {
            return z;
        }
 
    }
}

class Main 
{
    public static void main(String[] args)
    {
        Greater obj = new Greater();
        System.out.println("Greater of two number " + (obj.findGreater(5,3)));
        System.out.println("Greater of three number " + (obj.findGreater(5,4,1)));
    }
}