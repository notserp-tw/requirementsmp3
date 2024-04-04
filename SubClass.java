public class SubClass extends SuperClass
{
    int y;

    SubClass() {
        super();
        this.y = 20;
    }

    SubClass(int x, int y)
    {
        super(x);
        this.y = y;
    }

    public void display()
    {
        super.display("useless");
        System.out.println("SubClass y: " + y);
    }
    public String toString()
    {
        return "blah blah blah";
    }
    public void overrided()
    {
        System.out.println("hi im a subclass");
    }
    public boolean equals()
    {
        return false;
    }
}
