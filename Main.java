import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ArrayListReqs arrayListExample = new ArrayListReqs();
        arrayListExample.arrayListOperations();

        Array2DYap array2D = new Array2DYap();
        array2D.traverse2DArray();

        SubClass subClass = new SubClass();
        SuperClass notSuper = new SubClass();
        subClass.display();
        subClass.inherit();
        parameterReq(subClass);
        SuperClass[] arr = {subClass, notSuper};
        ArrayList<SuperClass> superAL = new ArrayList<SuperClass>();
        superAL.add(subClass);
    }
    public static void parameterReq(SuperClass s)
    {
        System.out.println(s);
    }
}


