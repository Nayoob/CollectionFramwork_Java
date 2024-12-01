import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        // how does map work ?
        // ====== > map basically work on the principle of key value pair each key must have one value
        // The map class doesnt lies under the collection framwork
        // it makes it own heirarchy the hasmap class implemets map 

        HashMap<Integer , String> map = new HashMap<>();
        map.put(1032 , "Muhammad Sufyan");
        map.put(9821 , "Jabbar");
        // maps can have one null key and multiple null values how does this work let me show you
         map.put(null , "shahid"); // one null key allowed
         map.put(null , "Iqrar");
        // here we have just replaced the key value now the shahid is repalced by iqrar
        map.put(23, "asghar");
        map.put(56 , "jenny");
        map.put(1032 , "Muhammad Sufyan");

      //  some methods in map interface //
        System.out.println(map.get(1032));
        System.out.println(map.containsKey(23));
        System.out.println(map.putIfAbsent(16,"iqbal"));
        System.out.println(map);
        System.out.println(map.remove(1032 ));
        System.out.println(map);
        System.out.println(map.containsValue("Muhammad Sufyan"));



    // Set<Integer> key = map.keySet();
    // for (int i : key){

            // int wont work why ? 
            // because here we are iterating over the key which holds null , and some other integer values so if we assign null to int so 
            // it will definetly through an error we cant assign null to int rather we can assign null to any refrence variable which we 
            // are doing in the loop below !!

    //     System.out.println(i);
    // }

        Set<Integer> key = map.keySet();
        for (Integer i : key){
            // auto unboxing hogii but the problem is null cant be auto unboxed by java  !
            System.out.println(i);
        }

        Set<Map.Entry<Integer , String>> string = map.entrySet();
        // this kinda syntax used when we want ot print the key as well as value in one run ...
        for (Map.Entry<Integer , String> st : string ){
            System.out.println(st.getKey() + " : " +  st.getValue());
//            output :
//            16 : iqbal
//            23 : asghar
//            1032 : Muhammad Sufyan
//            56 : jenny
//            9821 : Jabbar
        }











    }
}
