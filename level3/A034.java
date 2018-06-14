import java.util.LinkedList;
import java.util.Queue;

class Node34 {
	int value;
	Node34 left, right;
	public Node34(int value) {
		this.value = value;
		left = right = null;
	}
}

class Tree34 {
	Node34 root;
	boolean check (Node34 left, Node34 right) {
		if (left == null && right == null)
			return true;
		if ((left == null && right != null) || (left != null && right == null))
			return false;
		return check(left.left, right.right) && check(left.right, right.left);
	}
	boolean isSymmetric (Node34 root) {
		if (root == null)
			return true;
		return check(root.right, root.left);
	}
}

public class A034 {
	public static void main(String[] args) {
		Tree34 tree = new Tree34();
		tree.root = new Node34(1);
		tree.root.left = new Node34(2);
		tree.root.right = new Node34(3);
		tree.root.left.right = new Node34(6);
		tree.root.right.left = new Node34(5);
		if (tree.isSymmetric(tree.root)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
