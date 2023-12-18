import java.util.*;

public class Main {
    public static void main(String[] args) {
        NewSet<String> a = new NewSet<>();

        // add(E e)
        a.add("A");
        a.add("B");
        a.add("C");

        // size()
        System.out.println(a.size());

        // contains(Object o)
        System.out.println(a.contains("C"));

        // remove(Object o)
        a.remove("C");
        System.out.println(a.contains("C"));

        // iterator()
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // toArray()
        Object[] arr1 = a.toArray();
        System.out.println(Arrays.toString(arr1));

        // toArray(T[] a)
        String[] arr2 = a.toArray(a.toArray(new String[0]));
        System.out.println(Arrays.toString(arr2));

        // addAll(Collection<? extends E> c)
        List<String> list = Arrays.asList("C", "D", "E", "F");
        System.out.println(a.addAll(list));
        System.out.println(a.size());

        // retainAll(Collection<?> c)
        List<String> retainList = Arrays.asList("A", "B", "C", "D", "E");
        System.out.println(a.retainAll(retainList));
        System.out.println(a.size());
        System.out.println(a.contains("C"));
        System.out.println(a.contains("F"));

        // remove(Object o)
        List<String> removeList = Arrays.asList("D","E");
        System.out.println(a.removeAll(removeList));
        System.out.println(a.size());
        System.out.println(a.contains("D"));

        // containsAll(Collection<?> c)
        List<String> containsList  = Arrays.asList("B","C");
        System.out.println(a.containsAll(containsList));

        // isEmpty()
        System.out.println(a.isEmpty());

        // clear()
        a.clear();
        System.out.println(a.isEmpty());
    }
}