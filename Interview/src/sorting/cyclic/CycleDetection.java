package sorting.cyclic;

public class CycleDetection {

	public static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// Create a linked list with a cycle
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node2; // This creates a cycle: 5 -> 2

		// Create a linked list without a cycle
		ListNode head = new ListNode(10);
		head.next = new ListNode(20);
		head.next.next = new ListNode(30);
		head.next.next.next = new ListNode(40);
		head.next.next.next.next = new ListNode(50);

		boolean hasCycle1 = hasCycle(node1);
		boolean hasCycle2 = hasCycle(head);

		System.out.println("Linked list 1 has a cycle: " + hasCycle1); // Output: Linked list 1 has a cycle: true
		System.out.println("Linked list 2 has a cycle: " + hasCycle2); // Output: Linked list 2 has a cycle: false
	}
}
