import org.w3c.dom.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//class Node {
//    public int value ;
//    public Node next ;
//    Node(int value , Node next){
//        this.value = value ;
//        this.next = next ;
//    }
//    public String toString(){
//        return  " Node contains " +  value ;
//    }
//}
class Linkedlist{
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("carrot");

//        list.removeLast();
//        list.remove(0);

        for(String it : list){
            System.out.println(it);
        }
        System.out.println();
        // how to create a linkedlist on the go //
        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("watermelon","reddish","kiwi","Mango"));
        System.out.println(fruits);
        list.removeAll(fruits);
        System.out.println(list);
        System.out.println(fruits);

//        Node node3 = new Node(14 , null);
//        Node node2 = new Node(13 , node3);
//        Node node1 = new Node(12, node2);

//        ArrayList<Object> n1 = new ArrayList<>();
//        n1.add(node1);
//        n1.add(node2);
//        n1.add(node3);
//        for (Object o1 : n1){
//
//              System.out.println(o1);
//        }
//        System.out.println();
//        System.out.println(n1.get(0));

    }
}

