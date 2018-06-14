import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node3 {
	int value;
	Node3 left, right;
	Node3 (int value) {
		this.value = value;
	}
}


public class A030 {
	public static void revLevelOrder(Node3 root) {
		Queue<Node3> queue = new LinkedList<>();
		Stack<Node3> stack = new Stack<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node3 node = queue.poll();
			if (node.right != null)
				queue.add(node.right);
			if (node.left != null)
				queue.add(node.left);
			stack.push(node);
		}
		while (!stack.empty())
			System.out.print(stack.pop().value + " ");
	}
	public static Node3 createBinaryTree() {
		Node3 node = new Node3(1);
		Node3 node2 = new Node3(2);
		Node3 node3 = new Node3(3);
		Node3 node4 = new Node3(4);
		Node3 node5 = new Node3(5);
		node.left = node2;
		node.right = node3;
		node2.left = node4;
		node2.right = node5;
		return node;
		
	}
	public static void main(String[] args) {
		A030 tree = new A030();
		Node3 node = createBinaryTree();
		revLevelOrder(node);
	}
}
