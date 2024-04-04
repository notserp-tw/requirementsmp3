import java.util.ArrayList;

public class ArrayListReqs {
    ArrayList<Integer> list = new ArrayList<>();

    public void arrayListOperations() {
        list.add(10);
        list.add(0, 20);
        int firstElement = list.get(0);
        list.set(0, 30);
        list.remove(0); 
        int size = list.size();
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}