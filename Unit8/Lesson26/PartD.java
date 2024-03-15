import java.util.ArrayList;

public class PartD {

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        Integer temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Original List:        " + list);
        swap(list, 2, 7);
        System.out.println("List after swapping:  " + list);
    }
}