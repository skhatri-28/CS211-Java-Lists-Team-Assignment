//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")

public class ListClient3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        processList(list1);
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        processList(list2);
    }

    public static void processList(List list) {
        list.add(42);
        list.add(18);
        list.add(27);
        list.add(93);
        System.out.println(list);
        System.out.println("list.size() " + list.size());
        System.out.println("list.contains(18) " + list.contains(18));
        System.out.println("list.indexOf(18) " + list.indexOf(18));
    }
}
