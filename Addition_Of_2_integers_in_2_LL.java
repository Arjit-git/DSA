class addIntegers{
  static LinkedListNode add_integers(
      LinkedListNode integer1, 
      LinkedListNode integer2) {
          int carry =0;
            LinkedListNode result = null;
            LinkedListNode last = null;
        while(integer1 != null ||
              integer2 != null ||
              carry >0){

                int first = (integer1 == null ? 0 :integer1.data);
                int second = (integer2 == null ? 0 :integer2.data);
                int sum = first + second + carry;
                LinkedListNode newp = new LinkedListNode(sum % 10);
                carry = sum / 10;
                if(result == null)
                result = newp;
                else
                last.next = newp;

                last = newp;

                if(integer1 != null)
                integer1 = integer1.next;
                if(integer2 != null)
                integer2 = integer2.next;


        }
      return result;
  }
} 
