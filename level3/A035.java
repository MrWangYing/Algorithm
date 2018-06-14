import java.nio.file.Path;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.CORBA.PUBLIC_MEMBER;

class Node35 {
	int value;
	Node35 left, right;
	public Node35(int value) {
		this.value = value;
		left = right = null;
	}
}

class Tree35 {
	Node35 root;
	int x = 0;
	int count(Node35 node) {
		if (node != null) {
			if (node.left == null && node.right == null)
				x++;
				count(node.left);
				count(node.right);
		}
		return x;
	}
	
	void printPaths(Node35 node) {
		int path[] = new int[100];
		printPathsA(node, path, 0);
	}
	void printPathsA(Node35 node, int path[], int size) {
		if (node == null)
			return;
		path[size] = node.value;
		size++;
		if (node.left == null && node.right == null) {
			printArray(path, size);
		}else {
			printPathsA(node.left, path, size);
			printPathsA(node.right, path, size);
		}
	}
	
	void printArray(int arr[], int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

public class A035 {
	public static void main(String[] args) {
		Tree35 tree = new Tree35();
		tree.root = new Node35(1);
		tree.root.left = new Node35(2);
		tree.root.right = new Node35(3);
		tree.root.left.left	= new Node35(4);
		tree.root.left.right = new Node35(5);
		tree.root.right.left = new Node35(6);
		tree.root.right.right = new Node35(7);
		tree.root.right.left.left = new Node35(8);
		tree.root.right.right.right = new Node35(9);
		int x = tree.count(tree.root);
		System.out.println("有" + x + "个从根节点到叶子节点的路径:");
		tree.printPaths(tree.root);
//		System.out.println("有" + tree.x + "个从根节点到叶子节点的路径:");
//		上个语句必须执行完tree.printPaths后才能使tree.x为4.
	}
}
