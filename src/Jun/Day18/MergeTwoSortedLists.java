package Jun.Day18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null & list2 == null){
            return list1;
        }
        if(list1==null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode head = new ListNode();
        ListNode res = head;
        while (list1!= null&& list2!=null){
            if(list1.val>list2.val){
                head.next = list2;
                list2 = list2.next;
                head = head.next;
            }
            else if(list1.val<list2.val){
                head.next = list1;
                list1 =list1.next;
                head = head.next;
            }
            else{
                head.next = list1;
                list1 = list1.next;
                head = head.next;
                head.next = list2 ;
                list2 = list2.next;
                head = head.next;
            }

        }
        if (list1 != null){
            head.next = list1;
        }
        if(list2!=null){
            head.next = list2;
        }
        return res.next;

        /*while (list2!=null){
            ListNode tmp ;

            if (list2.val < list1.val) {
                int ts = list1.val;
                list1.val = list2.val;
                list2.val = ts;
            }
            tmp = list2.next;
            list2.next = list1.next;
            list1.next = list2;
            list1 = list1.next;
            list2 =tmp;
            list1 = list1.next;

        }

        return head ;*/
        /* ListNode head =null;
        ListNode curr = new ListNode();
        while(list1!=null && list2!=null){
            ListNode l1Curr = new ListNode(list1.val);
            ListNode l2curr = new ListNode(list2.val);
            ListNode nex ;
            if (l1Curr.val>l2curr.val){
                nex = l2curr;
            }else{
                nex = l1Curr;
            }
            if(head==null) {
                head = nex;
                head.next = curr;
            }
            curr = nex;
            curr = curr.next;
            list1 = list1.next;
            list2 = list2.next;
        }
        if(list2!=null){
            curr.next = list2;
        }
        if(list1!= null){
            curr.next = list1;
        }
        return  head;*/
        /*ArrayList<Integer> arr = new ArrayList<>();
        while (list1!=null){
            arr.add(list1.val);
            System.out.println(list1.val);
            list1 = list1.next;
        }
        while (list2!=null){
            arr.add(list2.val);
            System.out.println(list2.val);
            list2 = list2.next;
        }
        Collections.sort(arr);
        ListNode curr = new ListNode(arr.get(1));
        ListNode head = new ListNode(arr.get(0), curr);
        for (int i = 2; i < arr.size(); i++) {
            ListNode nex = new ListNode(arr.get(i));
            curr.next = nex;
            curr = curr.next;
            System.out.println(arr.get(i));

        }
        return head;*/

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));

        ListNode l11 = new ListNode(5);
        ListNode l22 = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(4))));
        ListNode res =  mergeTwoLists(l11,l22);

        System.out.println("-------------------");
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}