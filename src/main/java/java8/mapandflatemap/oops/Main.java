package java8.mapandflatemap.oops;

abstract class AbstractTest {

    protected  int i =10;
    abstract void display();

}


public class Main extends AbstractTest{

    //private int i=20;

    void display(){
        System.out.println(i);
    }
    public static void main(String[] args) {


        Main main = new Main();
        main.display();

     }


}
