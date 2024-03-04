import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Letter_Counter {


    public static void Main(String[] Args){
    
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a sentence to count its letters: ");

      String sentence = scanner.nextLine();



      Map<Character, Integer> map1 = new TreeMap<Character, Integer>();
    
      
      for(int i = 0; i < sentence.length(); i++){
      
        char c = sentence.charAt(i);

     if(map1.containsKey(c)){

        map1.replace(c,map1.get(c) + 1);


     }

   else if(c == ' '){
   
      continue;

   }

     

     else{
        map1.put(c,1);
     }


      }


      for(Map.Entry<Character,Integer> entry: map1.entrySet()){

            System.out.println(entry);

      }




}

}
