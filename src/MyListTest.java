public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(4);

        System.out.println("myList 1 = " + myList.get(1));

        System.out.println("myList 4 = " + myList.get(4));

        System.out.println("myList 3 = " + myList.get(3));
        myList.get(6);
        System.out.println("myList 6 = " + myList.get(6));
        myList.get(-1);
        System.out.println("myList 1 = " + myList.get(-1));
    }

}
