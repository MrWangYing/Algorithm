import java.util.LinkedList;
import java.util.Queue;

class Node39 {
	int value;
	Node39 left, right;
	public Node39(int value) {
		this.value = value;
		left = right = null;
	}
}

class Tree39 {
	Node39 root;
	void printCorner(Node39 root) {
		if (root == null)
			return;
		Queue<Node39> queue = new LinkedList<Node39>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			int n = size;
			while (n > 0) {
				Node39 node = queue.poll();
				n--;
				if (n == size - 1 || n == 0)
					System.out.print(node.value + " ");
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
		}
	}
}


public class A039 {
	public static void main(String[] args) {
		Tree39 tree = new Tree39();
		tree.root = new Node39(26);
		tree.root.left = new Node39(10);
		tree.root.right = new Node39(3);
		tree.root.left.left = new Node39(4);
		tree.root.left.right = new Node39(6);
		tree.root.left.left.right = new Node39(30);
		tree.root.right.right = new Node39(3);
		tree.printCorner(tree.root);
	}
}
