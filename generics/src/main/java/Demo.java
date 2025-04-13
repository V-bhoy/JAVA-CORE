import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Book b1 = new Book(1, "A");
        Book b2 = new Book(2, "B");
        Laptop l1 = new Laptop(3, "C");
        Laptop l2 = new Laptop(4, "D");

        CommonRecord<Book> books = new CommonRecord<>();
        CommonRecord<Laptop> laptops = new CommonRecord<>(); // reusing the same class with type Laptop

        books.addItem(b1);
        books.addItem(b2);
        // books.addItem(l1); // this will not allow you to add object of type laptop because the
        // books record is Book specific ensuring type safety at compile time

        laptops.addItem(l1);
        laptops.addItem(l2);

        System.out.println(books.getItem(0));
        System.out.println(laptops.getItem(0));

        // bad code
        CommonRecord<Object> record = new CommonRecord<>();
        record.addItem(b1);
        record.addItem(l1);
        record.addItem("Hello");
        Object o = record.getItem(0);
        //  This won't give any error, since it will store the item as object only
        // and return in the form of object only even if it is book / laptop / string
        Laptop o1 = (Laptop) record.getItem(1);
        // you need to manually typecast but can cause runtime exceptions

        // doesn't support loose coupling / inheritance during instantiation
        // it asks for the same data types on both sides
        // CommonRecord<Object> record1 = new CommonRecord<Laptop>();

        // before java 7
        CommonRecord<Laptop> record1 = new CommonRecord<Laptop>();

        // since java 7, no need to mention the type on right
        // but vice versa is not allowed
        CommonRecord<Laptop> record2 = new CommonRecord<>();

        // for backward compatibility, this is allowed,
        // but by default it will be Object Type
        // but again this is not a good practice
        CommonRecord record3 = new CommonRecord();

        // GENERIC METHOD
        Book[] arr = {b1, b2};
        Book book = findItem(arr, b2);
        System.out.println(book);
        // The issues and the things that are not allowed / or not a good practice
        // with a generic class also applies to generic method

        // WILDCARD
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Double> list1 = Arrays.asList(1.1, 2.2, 3.3);
        List<Number> list2 = Arrays.asList(1.1, 2.2, 3.3);
        List<String> list3 = Arrays.asList("Hello", "World");

        // Unbounded - accepts any type
        // use when you don’t care about the type — only want to read, not write.
        printList(list);
        printList(list1);
        printList(list2);
        printList(list3);

        // Upper Bounded Wildcard <? extends T> accepts T or subclass of T
        // Use when you want to read items of type T or its subtypes.
        printSub(list);
        printSub(list1);
        printSub(list2);
        // printSub(list3); - invalid since String is not subclass of a Number

        // Lower Bounded Wildcard <? super T> accepts T or superclass of T
        // Use when you want to write items of type T or its supertype.
        printSup(list);
        // printSup(list1); - invalid since Double is not super class of a Integer
        printSup(list2);
        // printSub(list3); - invalid since String is not super class of a Integer

    }

    // GENERIC METHOD
    // for multiple, separate it with a comma in diamond bracket
    public static <E> E findItem(E[] arr, E item) {
        for (E element : arr) {
            if (element.equals(item)) {
                return element;
            }
        }
        return null;
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void printSub(List<? extends Number> nums) {
        for (Number num : nums) {
            System.out.println(nums);
        }
    }

    public static void printSup(List<? super Integer> nums) {
        System.out.println(nums);
    }
}
