import java.util.*;

// Leetcode problem 217
public class ContainsDuplicate {

    // using Hashmap
    public static boolean method1(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            
            if(hm.containsKey(arr[i])){
                // if already in hashmap and then we are here it means its second occurence of element so means duplicate
                return true;
            } else {
                // if not in hashmap ie. first occurence of element then we add it in hashmap
                hm.put(arr[i], 1);
            }
        }
        return false;
    }
    
    // faster method 6ms using hashset
    public static boolean method2(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int item:arr){
            // if not able to addd in hashset its because its already present hence must be a duplicate element
            if(!set.add(item)){
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args){
        int arr[] = {1,2,3,4};

        boolean isduplicate = method1(arr);
        boolean isduplicate2 = method2(arr);

        System.out.println("by method 1: "+isduplicate+" by method 2: "+isduplicate2);

    }
}
