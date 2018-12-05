public class sort{
  public static void selectionsort(int [] ary){
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

  public static void main(String[] args){
    int[] ary = {15, 12, 6, 7, 14, 2, 1, 3, 17};
    selectionsort(ary);
    for (int i = 0; i < ary.length;i++){
      System.out.println(ary[i]);
    }
  }

}
