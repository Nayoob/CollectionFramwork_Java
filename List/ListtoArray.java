
import java.util.ArrayList ;
import java.util.List;

public class ListtoArray {
    public static void main(String[] args) {
        // how to converting list to Array ! 
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // to convert the list to array use the toArray() function !
    
        Object[] array1 = list.toArray(); 
        //  in this type of conversion if we dont specify what type of list are we going to convert to array then we need to declare the type 
        // of array as object to make it more generic now the object type array can store any refrence maybe string int double etc ... 
        Integer[] array = list.toArray(new Integer[0]); // what going on here ? 
        // so here we i specify the type of this array i am more type specific here to avoid errors 
        // [here the new Ineger array is passed to toArray() function] now the toArray() funtion will form another array to of size of list 
        // and store all the elements refrences of the list there and return the refrence of this new array formed by toArray() to refrence vairable array then .
        for (Integer iterable_element : array) {
            System.out.println(iterable_element);
        }
        // we are declaring the array of object type to store the refrences of the elements of the list ? wait what ? 
        // why the heck are we converting the list to array list if both of them store the freaking refrence ? 
        // first thing first arrays are more faster then lists becuase of there limited memory 
        // Arrays are list memeroy intensive then lists so some time we need to convert list to array for better performance !!! 



     }
}
