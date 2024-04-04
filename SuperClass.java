public class SuperClass
{
    int x;

    SuperClass()
    {
        this.x = 10;
    }

    SuperClass(int x)
    {
        this.x = x;
    }

    public void display(String useless)
    {
        System.out.println("SuperClass x: " + x);
    }
    public String toString()
    {
        return "blah blah blah";
    }
    public void overrided()
    {
        System.out.println("hi im a superclass");
    }
    public void inherit()
    {
        System.out.println("this got inherited");
    }
    public boolean equals()
    {
        return false;
    }
}
