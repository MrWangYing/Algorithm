
class Node37 {
	int value;
	Node37 left, right;
	public Node37(int value) {
		this.value = value;
		left = right = null;
	}
}

class Values {
	int min, max;
}

class Tree37 {
	Node37 root;
	Values val = new Values();
	void findMinMax (Node37 node, Values min, Values max, int hd) {
		if (node == null)
			return;
		if (hd < min.min)
			min.min = hd;
		else if (hd > max.max)
			max.max = hd;
		findMinMax(node.left, min, max, hd - 1);
		findMinMax(node.right, min, max, hd + 1);
	}
	void print (Node37 node, int line, int hd) {
		if (node == null)
			return;
		if (hd == line)
			System.out.print(node.value + " ");
		print(node.left, line, hd - 1);
		print(node.right, line, hd + 1);
	}
	void verticalOrder (Node37 node) {
		findMinMax(node, val, val, 0);
		for (int i = val.min; i <= val.max; i++) {
			print(node, i, 0);
			System.out.println();
		}
	}
}


public class A037 {
	public static void main(String[] args) {
		Tree37 tree = new Tree37();
		tree.root = new Node37(1);
        tree.root.left = new Node37(2);
        tree.root.right = new Node37(3);
        tree.root.right.left = new Node37(5);
        tree.root.right.right = new Node37(6);
        tree.root.right.left.left = new Node37(7);
        tree.root.right.left.right = new Node37(8);
        tree.verticalOrder(tree.root);
	}
}
