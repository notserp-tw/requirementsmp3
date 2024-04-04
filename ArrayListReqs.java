import java.util.ArrayList;

public class ArrayListReqs
{
    private int size;
    private int hi;
    //all instance vars being private safeguards and benefits personal security
    ArrayList<Integer> list = new ArrayList<>();

    public void arrayListOperations()
    {
        System.out.println(list.add(10));
        list.add(0, 20);
        hi = list.get(0);
        list.set(0, 30);
        System.out.println(list.remove(0));
        size = list.size();
        for (Integer i : list)
        {
            System.out.println(i);
            System.out.println(list.size());
            if (i.equals(list.get(3)))
            {
                list.remove(3);
            }
        }
    }
    public String toString()
    {
        return "blah blah blah";
    }
    public boolean equals()
    {
        return false;
    }
}