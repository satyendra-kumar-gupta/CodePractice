package codepre;

class TestTest
{
    static int t;
    TestTest()
    {
        System.out.print ("C ");
        t = 99;
    }
    static
    {
        t = 100;
        System.out.print ("S ");
        System.out.print (t + " ");
    }
    public void func()
    {
        t++;
        System.out.print (t + " ");
    }

    public static void main(String[] args)
    {

        TestTest test = new TestTest();
        test.func();

    }
}