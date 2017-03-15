package short_simple;

public class ListAg {
	public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * ����һ����������������е�����k����㡣
     */
    public ListNode FindKthToTail(ListNode head, int k) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        if (size < k) {
            return null;
        }
        ListNode node1 = head;
        for (int i = 0; i < size - k; i++) {
            node1 = node1.next;
        }
        return node1;
    }

    /**
     * ����һ��������ת�����������������Ԫ�ء�
     */
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head.next != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
     */
    public ListNode Merge(ListNode list1, ListNode list2) {  //�½�һ��ͷ�ڵ㣬������ϲ�������
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        //��δ�������������ӵ��ϲ��������β��
        if (list1 != null) {
            head.next = list1;
        }
        if (list2 != null) {
            head.next = list2;
        }
        return root.next;
    }
}
