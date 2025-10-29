import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        // Integer | Float | String
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        // add elements
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("ArrayList 1: " + list1);
        // add element at between
        list1.add(2, 25); // adds 25 at index 2

        System.out.println("ArrayList 1: " + list1);
        // remove element
        list1.remove(3); // removes element at index 3

        System.out.println("ArrayList 1: " + list1);

        // size of ArrayList
        int size = list1.size();
        System.out.println("Size of ArrayList 1: " + size);

        //loops
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Element at index " + i + ": " + list1.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list1);
        System.out.println("Sorted ArrayList 1: " + list1);
    }
}
