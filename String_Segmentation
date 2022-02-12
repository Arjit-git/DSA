public static boolean canSegmentString(String s, Set<String> dictionary) {
    for(int i=0;i<s.length();i++){
    String first = s.substring(0,i);
    if(dictionary.contains(first)){
      String second = s.substring(i);

      if(second == null || second.length() ==0 || dictionary.contains(second) || canSegmentString(second,dictionary))
      return true;
    }
    }
    return false;
  }
} 
