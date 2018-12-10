import java.util.Random;
public class Sorts{
  public static void selectionSort(int[] ary){
//choose the smallest put it into ary[0]
//choose the next smallest put it into ary[1]  (you can ignore the slots before the current position)
//choose the next smallest put it into ary[2]  (you can ignore the slots before the current position)
  for(int i = 0; i < ary.length;i++){
    int smallest = i;
  for(int n = smallest; n < ary.length;n++){
    if(ary[n] <= ary[smallest]){
      smallest = n;
    }
  }
  int temp = ary[i];
  ary[i] = ary[smallest];
  ary[smallest] = temp;
  }
  }

  public static void bubbleSort(int[] ary){
    for(int i = 0; i < ary.length;i++){
    for(int n = 0; n < ary.length - 1;n++){
      if (ary[n] > ary[n+1]){
      int temp = ary[n];
      ary[n] = ary[n+1];
      ary[n+1] = temp;
    }
  }
  }
}

   public static void main(String[] args){
  //   int[] test;
  //   if (args.length == 1){
  //     test = new int[Integer.parseInt(args[0])];
  //     for(int i = 0; i < test.length;i++){
  //     }
  //   }
  //
     int[] ary = {15, 12, 6, 7, 14, 2, 1, 3, 17};
     bubbleSort(ary);
     for (int i = 0; i < ary.length;i++){
       System.out.println(ary[i]);
     }
  //   System.out.println("----------------------");
  //   int[] a = { 0, 15, 1, 33, 26, 70, 45, 99, 5 } ; // all (+) #'s, no repeats
  //   selectionsort(a);
  //   for (int i = 0; i < a.length;i++){
  //     System.out.println(a[i]);
  //   }
  //   System.out.println("----------------------");
  //   int[] b = { 0, 0, 26, 15, 1, 33, 70, 1, 33, 99} ; // all (+) #'s, repeats allowed
  //   selectionsort(b);
  //   for (int i = 0; i < b.length;i++){
  //     System.out.println(b[i]);
  //   }
  //   System.out.println("----------------------");
  //   int[] c = { -14, -124, -3, -62, -22, -15 } ; // all (-) #'s, no repeats
  //   selectionsort(c);
  //   for (int i = 0; i < c.length;i++){
  //     System.out.println(c[i]);
  //   }
  //   System.out.println("----------------------");
  //   int[] d = { -124, -14, -15, -124, -62, -15 } ; // all (-) #'s, repeats allowed
  //   selectionsort(d);
  //   for (int i = 0; i < d.length;i++){
  //     System.out.println(d[i]);
  //   }
  //   System.out.println("----------------------");
  //   int[] e = { 17, -2, 521, 25, 62, -11, -4 } ; // mix of (+) and (-) #'s, no repeats
  //   selectionsort(e);
  //   for (int i = 0; i < e.length;i++){
  //     System.out.println(e[i]);
  //   }
  //   System.out.println("----------------------");
  //   int[] f = { 17, -11, -133, 521, -133, 95, 95, -11} ; // mix of (+) and (-) #'s, repeats allowed
  //   selectionsort(f);
  //   for (int i = 0; i < f.length;i++){
  //     System.out.println(f[i]);
  //   }
   }

}
