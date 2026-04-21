class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        List<Integer> ans = new ArrayList<>();

        while (odd != null) {
            ans.add(odd.val);
            if (odd.next == null) break;
            odd = odd.next.next;
        }

        while (even != null) {
            ans.add(even.val);
            if (even.next == null) break;
            even = even.next.next;
        }

        int i = 0;
        ListNode temp = head;
        while (temp != null) {
            temp.val = ans.get(i++);
            temp = temp.next;
        }

        return head; // FIXED
    }
}