import java.util.Arrays;

public class Day1{
  public static void main(String[] args) {
    int[] arr1 = {3, 4, 2, 1, 3, 3};
    int[] arr2 = {4, 3, 5, 3, 9, 3};
    calculate(arr1, arr2);
  }
  static void calculate(int[] arr1, int[] arr2){
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int len = Math.min(arr1.length, arr2.length);
    int diff = 0;
    for (int i=0; i<len; i++){
      diff = diff + Math.abs(arr1[i]-arr2[i]);
    }
    System.out.println(diff);
  }
}

