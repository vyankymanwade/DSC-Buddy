import java.util.*;

class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println("after adding 3 element: " + al);
        al.add(1, 15);
        System.out.println("after adding 15 at 1: " + al);
        al.set(2, 20);
        System.out.println("after setting 20 at 2: " + al);
        al.add(50);
        System.out.println("after adding 50 at end: " + al);
        al.remove((Integer) 50);
        System.out.println("after removing 50: " + al);
        al.remove(al.size() - 1);
        System.out.println("after removing last element: " + al);

        // iterating using for

        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
        System.out.println();

        // iterating using for each loop
        for (Integer i : al)
            System.out.print(i + " ");
        System.out.println();

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(100);
        al2.add(90);

        System.out.println("al2: " + al2);
        al.addAll(al2);
        System.out.println("after adding all from al2 to al1: " + al);

        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3.add(70);
        al3.add(80);

        al.addAll(3, al3);
        System.out.println("after adding al3 at index 3: " + al);
        System.out.println("before al3.clear(): " + al3);
        al3.clear();
        System.out.println("after al3.clear(): " + al3);

        al.ensureCapacity(100); // now arraylist can store 100 element for sure

        al.forEach((n) -> printDouble(n)); // it will call the printDouble() for each value in ArrayList and we are
                                           // passing the action to forEach()

        System.out.println(al.isEmpty());
        System.out.println("first occurance at: " + al.indexOf(70));// gives index of first occurance of 70
        System.out.println("first occurance at: " + al.lastIndexOf(70)); // gives inex of last occurance if 70

        Iterator i = al.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        // iterate using Listoterator

        ListIterator li = al.listIterator(2); // starts from 2nd index
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        ListIterator li2 = al.listIterator(); // only applycable for classes which implements List
        while (li2.hasPrevious()) {
            System.out.print(li2.previous() + " ");
        }
        System.out.println();

        /*
         * difference between Iterator and ListIterator 1) Iterator only in one
         * direction but ListIterator travels in both direction 2) iterator can not
         * update element of collection but ListIterator can modify the element from
         * collection
         */
        System.out.println("al2 " + al2);
        al.removeAll(al2);
        System.out.println("after removing elements from al which are present in al2: " + al);

        // removing element from al which are divisible by 4
        al.removeIf((n) -> (n % 4 == 0));
        System.out.println("after removing element which are divisible by 4: " + al);

        // converting list to array

        Integer a[] = new Integer[al.size()];
        a = al.toArray(a);

        for (Integer item : a)
            System.out.print(item + " ");
        System.out.println();
    }

    public static void printDouble(int n) {
        System.out.print(n * 2 + " ");
    }
}