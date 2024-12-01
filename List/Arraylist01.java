
import java.util.ArrayList;
import java.util.Iterator;

class Arraylist03{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sufyan");
        list.add("zia");
        list.add("ishaq");
        list.add("jabbar");
    // we can add one list into another list too // 

       ArrayList<String> list2 = new ArrayList<>();
       list2.add("hamayoon");
       list2.add("Qari");
       list2.add("jaffar");

       list.addAll(list2); 

       System.out.println(list);
     //  lets implement iterator to iterate over the elements in list // 
     
       Iterator<String> iterator = list.iterator();
       // how is this hasnext() and next function() iterating over the list 
       // so think of an array containing 3 elements The hasnext() function and next() both are pointing at index -1 
       // in the first iteration the hasnext check if there is any element in index 0 if yes return true to loop
       // In loop we are printing the first element of the list which is on index 0 the next() fetch the data stored in the 0th index 
       // and increment the cursor to index 0 . and the iteration goes on .... untill the hasnext() return false .

       while (iterator.hasNext()) {
        // let me clarify one more thing here auto_unboxing happens when you assign the Integer object to a primitive int
        // or use it in a context where a primitive int is required {with double and char too }
        // here since the string is not primitive in java its an object and have no wrapper class 
        // so no auto_unboxing happens here rather the sout implicitly call the toString() on iterator to retrive the values of list
    // =====>   lets say we have int elements in list how does the auto unboxing work then ? 

        // the next() function here cant convert the refrence to int value and the toString dont work here too then how does the refrence turn 
        // to int value in this case the java implicitly do the auto_unboxing how ? 
     
        // while (iterator.hasNext()) {
        //     int interator = iterator.next(); // this is where the auto_unboxing happens 
        //     System.out.println(iterator);    will print all the int values 
        // }
          System.out.println(iterator.next());
       }


       ArrayList<Integer> list1 = new ArrayList<>();
       list1.add(12);
       list1.add(13);
       list1.add(14);
       list1.add(15);
       list1.add(16);
       list1.add(17);
   
   
       Iterator<Integer> it2 = list1.iterator();
      
       while (it2.hasNext()){
           Integer current = it2.next();
          
           // int current1 = current ;
           if(current.equals(15)){
               it2.remove();
           }
           else{
               System.out.println(current);
           }
           
       }
   }
       
}
