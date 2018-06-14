import java.util.Scanner;

class Node {
	int value;
	Node left, right;
	Node(int value) {
		this.value = value;
		left = right =  null;
	}
}

class BinaryTree {
	Node root;
	boolean findAncestors(Node node, int target) {
		if (node == null) {
			return false;
		}
		if (node.value == target) {
			return true;
		}
		if (findAncestors(node.left, target) || findAncestors(node.right, target)) {
			System.out.print(node.value + " ");
			return true;
		}
		return false;
	}
}

public class A029 {
	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		bTree.root = new Node(1);
		bTree.root.left = new Node(2);
		bTree.root.left.left = new Node(4);
		bTree.root.left.right = new Node(5);
		bTree.root.right = new Node(3);
		bTree.root.right.left = new Node(6);
		bTree.root.right.right = new Node(7);
		bTree.root.right.left.left = new Node(8);
		bTree.root.right.right.right = new Node(9);
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		bTree.findAncestors(bTree.root, a);
	}
}
