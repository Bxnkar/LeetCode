package linkedlist;
public class LinkedListCycle2 {
    public static ListNode detectCycle(ListNode head){
        if (head == null || head.next == null){
            return null;
        }
        ListNode slow = head , fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
            if (fast == null || fast.next == null){
                return null;
            }
        while(head != slow){
            slow = slow.next;
            head = head.next;
        }
        }
        return head;
        }
        public static void main(String[] args) {
            ListNode one = new ListNode(1);
            ListNode two = new ListNode(2);
            ListNode three = new ListNode(3);
            ListNode four = new ListNode(4);
            ListNode five = new ListNode(5);

            one.next = two;
            two.next = three;
            three.next = four;
            four.next = five;

            ListNode result = detectCycle(one);
            System.out.println(result);
        }
    }