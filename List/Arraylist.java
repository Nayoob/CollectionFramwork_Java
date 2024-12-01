import java.util.ArrayList;
import java.util.Iterator;

class Arraylist{
    public static void main(String ar[]){
        // create an array list //
        ArrayList<String> list = new ArrayList<>();
        list.add("Sufyan");
        list.add("jabbar");
        list.add("zia");
        list.add("habib");
        list.add("hamayoon");

        System.out.println(list);

        list.remove(String.valueOf("hamayoon"));
        list.remove(2);
        System.out.println(list);

        // we can add the valve to in the middle of the list // 
        list.add(0,"firooon khan");

        // we can set valve in the list too // 

        list.set(3,"Qari khooti");
        System.out.println(list);

        System.out.println(list.clone());

        // one more thing we can add one arraylist in another array list this is possible too // 

        ArrayList<String> newlist = new ArrayList<>();
        newlist.add("Sir yahyaaa");
        newlist.add("Amir shehzad");
        newlist.add("habib");

        list.addAll(newlist);
        System.out.println(list);

        
        // we do have some loops kinda thing and iterator to iterate through each list // 
        for (int index = 0; index < list.size(); index++) {
            System.out.println( "In list index " + index + " Contains " + list.get(index) );
        }

        // for each loop // 
        for (String it : list) {
            System.out.println(it);
        }
        System.out.println();

        // Another way to iterate through the list is the iterator // 

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}