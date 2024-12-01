
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        list1.set(1, "Thursday");

           // list1.add("wednesday") nor we can do remove on this way ; ===> throw an exception 
          // but we can set the existing values 

        // Another way to initialize the array list but in this method we cant use add remove methods but we can do set method on 
       // this type of initialization 


       List<String> list3 = List.of("haji ghayoor" , "Muhajir lala");          // in type of declaration we cant even set the list // 


        ArrayList<String> list = new ArrayList<>();
        list.add("Sufyan");
        list.add("zia");
        list.add("ishaq");
        list.add("jabbar");

        // using the addAll function we can pass the 
        list.addAll(list1);

      

        for (String iterable_element : list1) {
            System.out.println(iterable_element);
        }

      
        for (String iterable_element : list3) {
            System.out.println(iterable_element);
        }
        
  

    }
}
