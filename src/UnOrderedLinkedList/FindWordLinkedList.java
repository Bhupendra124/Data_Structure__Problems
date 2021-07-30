package UnOrderedLinkedList;

import java.util.LinkedList;
import java.util.*;

public class FindWordLinkedList {
    public static void main(String[] args) {


        LinkedList<String> list=new LinkedList();

        String message = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        list.add(message);

        System.out.println(list);
        //String to string conversion
        String [] messageArray=message.split(" ");
        System.out.println(messageArray);

        //itreate within array
        for (String word:messageArray)
       {
            //search word in linklist
            String value= (String) list.get(Integer.parseInt(word));
           if (value==null)
                value= String.valueOf(1);
           else
                value=value+1;
                       list.add(Integer.parseInt(word),value);

        }
        //Display
        System.out.println(list);
        //remove avoidable from linked list
        list.remove("avoidable");

        //display list
        System.out.println(list);

    }
}
