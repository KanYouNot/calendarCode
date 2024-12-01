import java.util.Arrays;

public class Day1{
  public static void main(String[] args){
    int[] arr1 = {3, 4, 2, 1, 3, 3};
    int[] arr2 = {4, 3, 5, 3, 9, 3};

    calculate(arr1, arr2);
  }
  public static void calculate(int[] arr1, int[] arr2){
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int diff = 0;
    int out = 0;
    for (int i=0; i<arr1.length; i++) {
      for (int j=0; j<arr2.length; j++) {
        if (arr1[i]==arr2[j]){
          diff++;
        }
        else{
          diff = 0;
        }
      }
      out = out+(arr1[i]*diff);
    }
    System.out.println(out);
  }
}
