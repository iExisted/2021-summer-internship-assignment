 /*
  What needs to be done

  1. Remove duplicates in original array
    1a. Put array into array list
    1b. Turn array list back into list to remove duplicates
    1c. Turn list back into array
  2. Use a nested loop to find all combinations that add up to sum
    print combinations

*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class question1 {
 
  //Find all pairs function (simultaneous removal of duplicates)
  static void findPairs(int[] array, int sum){
    //REMOVING DUPLICATES 
    //Convert array to array list
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    for(int i = 0; i < array.length; i++){
      arrayList.add(new Integer(array[i]));
    }

    //Converts to list to remove duplicates
    List<Integer> listNoDupes = arrayList.stream().distinct().collect(Collectors.toList());
    
    //Converts list back to array
    Integer[] arrayNoDupe = new Integer[listNoDupes.size()];
    arrayNoDupe = listNoDupes.toArray(arrayNoDupe);
    int n = arrayNoDupe.length;

    //nested loop to check all pair possibilities
    for(int i = 0; i < n; i++){
      for(int e = i + 1; e < n; e++){
        
        //If pair matches sum print values of the pair
        if(arrayNoDupe[i] + arrayNoDupe[e] == sum){
          System.out.println("(" + arrayNoDupe[i] + "," + arrayNoDupe[e] + ")");
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] testArray = {2, 4, 5, 1, 3, 5, 4};
    int[] secondTest = {2, 4, -8, -1, 6, 7};
    int targetSum = 6;
    System.out.print("Test 1:\n");
    findPairs(testArray, targetSum);
    System.out.print("Test 2:\n");
    findPairs(secondTest, targetSum);
  }
}
