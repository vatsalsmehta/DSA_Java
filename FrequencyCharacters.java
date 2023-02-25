import java.util.*;

public class FrequencyCharacters {

    // Global variables
    static String userInput = "Hello";
    static int i = 0;

    public static void method1(){
        char charArray[] = userInput.toCharArray();
        HashMap<Character,Integer> frequencyMap=new HashMap<>();
        int length = userInput.length();
        for(i=0; i<length; i++){
            // if character is present in hashmap get that value and increment by 1
           if(frequencyMap.containsKey(charArray[i])){
            frequencyMap.put(charArray[i], frequencyMap.get(charArray[i])+1);
           } else {
            // if character is not present add in hashmap and set value to 1
            frequencyMap.put(charArray[i], 1);
           }
        }
        System.out.println(frequencyMap);

    }

    public static void method2(){
        char charArray[] =  userInput.toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        int length =  userInput.length();
        for(i=0; i<length; i++){
            
            frequencyMap.computeIfPresent(charArray[i], (key,val)-> val+1);	  
            // if the character is not present in the hashmap
            // set count to 1 using computeIfAbsent method
	        frequencyMap.computeIfAbsent(charArray[i], (val)-> 1);	
        }
        System.out.println(frequencyMap);
    }

    public static void main (String[] args) {
        method2();
    } 
}