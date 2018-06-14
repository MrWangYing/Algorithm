import java.util.Scanner;

class Node {
	int value;
	Node leftChild;
	Node rightChild;
	Node(int value) {
		this.value = value;
	}
	public void display() {
		System.out.print(this.value + " ");
	}
	public String toString() {
		return String.valueOf(value);
	}
}

class BinaryTree {
	private Node root = null;
	public BinaryTree(int value) {
		root = new Node(value);
		root.leftChild = null;
		root.rightChild = null;
	}
	public String add(int value) {
		String error = null;
		Node node = new Node(value);
		if (root == null) {
			root = node;
			root.leftChild = null;
			root.rightChild = null;
		}else {
			Node current = root;
			Node parent = null;
			while (true) {
				if (value < current.value) {
					parent = current;
					current =current.leftChild;
					if (current == null) {
						parent.leftChild = node;
						break;
					}
				}else if (value > current.value) {
					parent = current;
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = node;
						break;
					}
				}else {
					error = "having sanme value in binary tree";
				}
			}
		}
		return error;
	}
	public void print() {
		print(root);
		System.out.println();
	}
	private void print(Node node) {
		if (node == null)
			return;
		print(node.leftChild);
		node.display();
		print(node.rightChild);
	}
}



public class A028 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a[] = new int [6];
		for (int i = 0; i < 6; i++) {
			a[i] = scanner.nextInt(); 
		}
		BinaryTree bTree = new BinaryTree(a[0]);
		for (int i = 1; i < 6; i++) {
			bTree.add(a[i]);
		}
		bTree.print();
	}
}
