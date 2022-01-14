package singleLinked;

public class ListNode {
	
	private ListNode next;
	
	/* ˫ָ���Ӧ�ã���������ĵ���k����� */
	public ListNode findFromEnd(ListNode head, int k) {
		ListNode p1 = head;
		// ͨ��p1���n-k
		for(int i = 0 ;i < k; i++) {
			p1 = p1.next;
		}
		ListNode p2 = head;
		// ��p2��λ��n-kλ
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

}
