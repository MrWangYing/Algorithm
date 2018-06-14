import java.util.Scanner;
import java.util.logging.Level;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.CORBA.TRANSACTION_REQUIRED;

class Node32 {
	int value;
	Node32 left, right;
	public Node32(int value) {
		this.value = value;
		left = right = null;
	}
}

class Tree32 {
	Node32 root;
	boolean isBrother(Node32 node, Node32 a, Node32 b) {
		if (node == null)
			return false;
		return ((node.left == a && node.right == b) || (node.left == a && node.right == b) || isBrother(node.left, a, b) || isBrother(node.right, a, b));
	}
	int level (Node32 node, Node32 ptr, int lev) {
		if (node == null)
			return 0;
		if (node == ptr)
			return lev;
		int l = level(node.left, ptr, lev + 1);
		if (l != 0)
			return 1;
		return level(node.right, ptr, lev + 1);
	}
	boolean isCousin (Node32 node, Node32 a, Node32 b) {
		return((level(node, a, 1) == level(node, b, 1)) && (!isBrother(node, a, b)));
	}
	
}
public class A032 {
	public static void main(String[] args) {
		Tree32 tree = new Tree32();
		tree.root = new Node32(1);
		tree.root.left = new Node32(2);
		tree.root.right = new Node32(3);
		tree.root.left.left = new Node32(4);
		tree.root.left.right = new Node32(5);
		tree.root.right.left = new Node32(6);
		tree.root.right.right = new Node32(7);
		tree.root.right.left.left = new Node32(8);
		tree.root.right.right.right = new Node32(9);
		Scanner scanner = new Scanner(System.in);
		Node32 a = new Node32(scanner.nextInt());
		Node32 b = new Node32(scanner.nextInt());
		if (tree.isCousin(tree.root, a, b))	
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
