import java.util.Vector;
import java.util.Comparator;


class imported implements Comparator<Integer>{

    public int compare(Integer s1 , Integer s2) {
        return s2 - s1  ;
    } // 34 35

}
public class vector {
    public static void main(String[] args ){
        Vector<Integer> list = new Vector<>();
        // we have capasity function too in the vectors whcih we dont have in arraylist 

        System.out.println(list.capacity());
    
        list.add(34);
        list.add(45);
        list.add(88);
        list.add(12);
        list.add(2);
        list.sort(null); // ascending sort
        System.out.println(list);
        list.sort(new imported());
        System.out.println(list);
        for(Integer i : list){
            System.out.println(i);
        }
        // Now lets do some theory On why vector ?
        // so first thing first when ever the vector initial
        // capacity of vector filled up which is 10
        // the new array is formed the double of size of the first one
        // like if the initial array is of capacity 10 the next array will be of size 20

        // ==> vector are also used for thread safety now what is thread safety and how does it
        // affect our code
        //  Thread safety refers to the ability of a class or method to behave correctly when multiple threads
        //  access it concurrently. When multiple threads operate on the same object, thread-safety ensures that the
        //  object doesn't end up in an inconsistent or incorrect state due to concurrent access.
        //

        // before moving forward lets first disscuss the concept of synchronization in java
        // ==> it is the concept in which they allow only one thread to access the particular piece of code  at a time
        // in the mean time we have to lock the next thread request

        // so in conclusion
        //Vector is a class in Java that implements the List interface. Unlike ArrayList,
        // which is not synchronized, Vector is synchronized, meaning it’s designed to be thread-safe.

        // it means only one thread at a time can access  the function with is declared in vector like add remove all
        // these are synchronized methods

        // Vector is synchronized. Multiple threads can safely use a Vector,
        // but there will be a performance penalty because of the locking mechanism.

        //    ArrayList is not synchronized. This means that if multiple threads try to modify
        //    an ArrayList at the same time, it may lead to data corruption or inconsistent state.

        //////// ======================== >>>> After all this we still dont prefer using vectors ============/////
        // because it bring a huge overhead which is this locking mechanism
        // while the synchronization guarrente the thread safety but it come with performance cost

    }
}

