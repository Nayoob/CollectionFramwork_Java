import javax.crypto.IllegalBlockSizeException;
import java.util.Stack;
import java.util.ArrayList;
public class stack {
    public static void main(String[] args){
     Stack<Integer> list = new Stack<>();
     // stack basically work on first in last out model //

        // since stack extends vectors so the methods of the stack are also synchronized means they ensure the thread
        // safety too like vectors

        list.push(12);
        list.push(13);
        list.push(14);
        list.push(15);
        list.push(16);
        list.push(17);
        list.pop();

       // System.out.println(list.pop());

       ArrayList<Integer> arraylist = new ArrayList<>();
       arraylist.add(88);
       arraylist.add(99);
       arraylist.add(100);


        Integer peek = list.peek(); // so basically the peek method give us the value which is on the top of the stack
        System.out.println(peek);
      
        System.out.println(list.isEmpty()); 
        System.out.println(list.empty());
        list.addAll(arraylist);

        Integer peek2 = list.peek();
        System.out.println(peek2);

        System.out.println(list);


    }
}

