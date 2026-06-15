class Solution {
    public ListNode reverseList(ListNode head) {
      if(head==null) return head;
       ListNode prev=null;
       ListNode curr=head;
       ListNode front=head.next;
       while(curr!=null){
        front=curr.next;
        curr.next=prev;
        prev=curr;
        curr=front;
     
       }
       return prev;
    }
   
    
    }