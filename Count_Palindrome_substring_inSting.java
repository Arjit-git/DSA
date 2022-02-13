// if single characters are not considered palindrome
class PalindromeSubStrings{
  public static int findAllPalindromeSubstrings(String input) {
      
      int count =0;

      for(int i=0;i<input.length();i++){

        for(int l=i-1, r=i+1; (l>=0 && r<input.length() && (input.charAt(l) == input.charAt(r)));l--,r++){
          count++;
        //   System.out.println("even"+(r-l));
           //System.out.println(input.substring(l, r+1));
        }
        
        for(int l=i, r=i+1; (l>=0 && r<input.length() && (input.charAt(l) == input.charAt(r)));l--,r++){
          count++;
        //  System.out.println("odd"+(r-l));
       //    System.out.println(input.substring(l, r+1));
        }
      }
      return count;
  }
}

// if single characters are  considered palindrome
class PalindromeSubStrings{
  public static int findAllPalindromeSubstrings(String input) {
      
      int count =0;

      for(int i=0;i<input.length();i++){

        for(int l=i, r=i; (l>=0 && r<input.length() && (input.charAt(l) == input.charAt(r)));l--,r++){
          count++;
        //   System.out.println("even"+(r-l));
           //System.out.println(input.substring(l, r+1));
        }
        
        for(int l=i, r=i+1; (l>=0 && r<input.length() && (input.charAt(l) == input.charAt(r)));l--,r++){
          count++;
        //  System.out.println("odd"+(r-l));
       //    System.out.println(input.substring(l, r+1));
        }
      }
      return count;
  }
}
