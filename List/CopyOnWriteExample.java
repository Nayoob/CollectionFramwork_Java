import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
       
        list.add("A");
        list.add("B");
        list.add("C");

        // Reading from the list 
        Thread readerThread = new Thread(() -> {
            for (String item : list) {
                System.out.println("Reading: " + item);
            }
        });

        // Writing to the list 
        Thread writerThread = new Thread(() -> {
            list.add("D");
            System.out.println("Writing: D");
        });

        readerThread.start();
        writerThread.start();
    }
}
