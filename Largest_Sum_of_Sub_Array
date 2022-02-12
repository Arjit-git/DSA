class LargestSum{
  static int findMaxSumSubArray(int[] A) {
    //TODO: Write - Your - Code
    int max =A[0];
  int cur =A[0];

  for(int i=0;i< A.length;i++){
   if(cur < 0)
   cur = A[i];
   else
    cur += A[i];
    if(cur > max)
    max =cur;
    if(cur <0)
    cur=0;
  }
  return max;
}
    
  }
 
