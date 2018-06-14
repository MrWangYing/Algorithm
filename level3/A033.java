class Node33 {
	int value;
	Node33 left, right;
	public Node33(int value) {
		this.value = value;
		left = right = null;
	}
}

class Tree33 {
	Node33 root;
	static int height (Node33 node) {
		if (node == null)
			return 0;
		return (1 + Math.max(height(node.left), height(node.right)));
	}
	int diameter (Node33 root) {
		if (root == null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		int ld = diameter(root.left);
		int rd = diameter(root.right);
		return Math.max(lh + rh + 1, Math.min(ld, rd));
	}
	int diameter() {
		return diameter(root);
	}
}

public class A033 {
	public static void main(String[] args) {
		Tree33 tree = new Tree33();
		tree.root = new Node33(1);
		tree.root.left = new Node33(2);
		tree.root.right = new Node33(3);
		tree.root.right.left = new Node33(5);
		tree.root.right.right = new Node33(6);
		tree.root.right.left.left = new Node33(7);
		tree.root.right.left.right = new Node33(8);
		System.out.println(tree.diameter());
	}
}
