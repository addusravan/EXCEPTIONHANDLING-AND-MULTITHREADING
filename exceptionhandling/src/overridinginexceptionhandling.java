

//Method overriding in Subclass with UnChecked Exception
import java.io.*;

class Super
{
    void show() {
        System.out.println("parent class");
    }
}

class Sub extends Super
{
    void show() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("child class");
    }

    public static void main(String[] args)
    {
        Super s = new Sub();
        s.show();
    }
}
