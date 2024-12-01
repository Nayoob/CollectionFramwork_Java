
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class StringlenthComparator implements Comparator<String> {
  @Override
    public int compare(String s1 , String s2) {
      return s1.length() -  s2.length()  ;
  }  //  "tree" , "mango"
}
class mycomparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
    // 12 , 20
}
public class comparator {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(99);
        list.add(1);
       // Collections.sort(list);

        list.sort(null);
        System.out.println(list);// so the issue is we can only use sort method to sort stuff in assending order
        // to sort stuff in decending order we have to use comparator to write custom logic for each sorting type
        // so for that we have to implement a class comparator let do it for descending order
        list.sort(new mycomparator());
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Tree");
        list1.add("Mango");
        list1.add("Bamboo Tree");

        list1.sort(new StringlenthComparator());
        System.out.println(list1);
    }

}
