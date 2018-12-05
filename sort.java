public class sort{
  public static void selectionsort(int [] ary){
//choose the smallest put it into ary[0]
//choose the next smallest put it into ary[1]  (you can ignore the slots before the current position)
//choose the next smallest put it into ary[2]  (you can ignore the slots before the current position)
  for(int i = 0; i < ary.length;i++){
    int smallest = ary[i];
    int current = i;
  for(int n = current; n < ary.length;n++){
    if(ary[n] <= smallest){
      current = n;
    }
  }
  int temp = ary[current];
  ary[i] = temp;
  ary[current] = smallest;
  }
  }

}
