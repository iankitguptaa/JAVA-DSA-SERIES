import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionFramework1 {
    public static void main(String[] args) {
        // List arr collecton -> interface

        // Arraylist -> concrete class
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        // addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        // i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        list3.get(0);
        System.out.println(list3.get(2));
        System.out.println("Before set : " + list3);
        list3.set(0, 100);
        System.out.println("After set : " + list3);

        // toArray
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // contains
        System.out.println(list3.contains(100));
        System.out.println(list3.contains(1000));

        list.add(12);
        list.add(6);
        System.out.println(list);

        // sort
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
        System.out.println(newlist);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
    }
}
