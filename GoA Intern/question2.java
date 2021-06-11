/*
What needs to be done

1. Create two new array list with the same values as array a and array b
2. Find all similar elements in array a and array b
3. Remove those elements in the new array lists
  3a. Find index of given element
4. Convert the new array lists into array

*/
import java.util.ArrayList;

class question2 {
  //Reconcile function
  static void reconcileHelper(int[] a, int[] b) {
    //Create array new array lists with the same elements as original array
    ArrayList<Integer> aList = new ArrayList<Integer>();
    ArrayList<Integer> bList = new ArrayList<Integer>();

    for(int i = 0; i < a.length; i++){
      aList.add(new Integer(a[i]));
    }
    for(int i = 0; i < b.length; i++){
      bList.add(new Integer(b[i]));
    }

    //Loop finds all similar elements in array a and array b
    for(int i = 0; i < a.length; i++){
      for(int e = 0; e < b.length; e++){
        //If array a and array b contains same element remove said element from aList and bList
        if(a[i] == b[e]){
          int findIndexA = aList.lastIndexOf(a[i]);
          aList.remove(findIndexA);

          int findIndexB = bList.lastIndexOf(b[e]);
          bList.remove(findIndexB);
        }
      }
    }

    //Converts array list to array and prints outcome 
    //for array a and array b
    Integer[] aNew = new Integer[aList.size()];
    aNew = aList.toArray(aNew);
    System.out.println("Numbers in array a that aren't in array b:");
    for(int i : aNew){
      System.out.print(i + " ");
    }
    System.out.println("\n");

    Integer[] bNew = new Integer[bList.size()];
    bNew = bList.toArray(bNew);
    System.out.println("Numbers in array b that aren't in array a:");
    for(int i : bNew){
      System.out.print(i + " ");
    }
    System.out.println("\n");
  }

  public static void main(String[] args) {
    int[] firstArray = {1, 7, 8, 4, 2, 6};
    int[] secondArray = {1, 6, 2, 4, 5};

    reconcileHelper(firstArray, secondArray);
  }
}