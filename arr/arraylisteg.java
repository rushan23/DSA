package arr;
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.ArrayList;

public class arraylisteg {
   public static void main(String[] var0) {
      ArrayList<Integer> var1 = new ArrayList<>();
      var1.add(0, 1);
      var1.add(4);
      var1.add(3);
      var1.add(5);
      var1.add(3);
      System.err.println("" + String.valueOf(var1));
      var1.set(0, 2);
      System.err.println("" + String.valueOf(var1));
      var1.remove(2);
   }
}
