import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args){
    String fname = "input.txt";
    int out = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(fname))){
      String ln;
      while ((ln=br.readLine())!=null){
        String[] nums = ln.split("\\s+");
        int[] lv = new int[nums.length];
        for (int i=0; i<nums.length; i++){
          lv[i] = Integer.parseInt(nums[i]);
        }
        if (isGood(lv) || Possible(lv)){
          out++;
        }
      }
    } catch (IOException e){
      System.err.println(e.getMessage());
    }
    System.out.println(out);
  }
  private static boolean isGood(int[] lv){
    if (lv.length<2){
      return true;
    }
    boolean inc = lv[1]>lv[0];
    for (int i=1; i<lv.length; i++){
      int diff = lv[i]-lv[i-1];
      if (Math.abs(diff)<1 || Math.abs(diff)>3){
        return false;
      }
      if (inc&&lv[i]<=lv[i-1]){
        return false;
      }
      if (!inc&&lv[i]>=lv[i-1]){
        return false;
      }
    }
    return true;
  }
  private static boolean Possible(int[] lv){
    for (int i=0; i<lv.length; i++){
      int[] nlv = new int[lv.length-1];
      for (int j=0, k=0;j<lv.length;j++){
        if(j!=i){
          nlv[k++] = lv[j];
        }
      }
      if (isGood(nlv)){
        return true;
      }
    }
    return false;
  }
}
