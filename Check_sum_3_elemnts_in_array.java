Sum of three exist in array or not


class sumOfThree{

  public static Boolean
  find_sum_of_three(int arr[], int required_sum) {
     // TODO: Write - Your - Code

     for(int i = 0; i< arr.length-2;i++){
       if(find_sum_of_two(arr,(required_sum - arr[i]),i+1))
       return true;
       
     }

    return false;
  }
  public static Boolean find_sum_of_two(int arr[], int remaining_sum,int index){
    int start = index;
    int end = arr.length-1;
    

    while(start< end){
      int sum = arr[start] + arr[end];
      if(sum == remaining_sum){
        return true;
      }
      else if(sum < remaining_sum){
        start++;
      }
      else if(sum > remaining_sum)
      end--;
    }
    return false;

  }
} 
