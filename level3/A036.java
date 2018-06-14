import java.util.TreeMap;
import java.util.Map.Entry;

class Node36 {
	int value;
	Node36 left, right;
	public Node36(int value) {
		this.value = value;
		left = right = null;
	}
}

class Tree36 {
	Node36 root;
	public static void vertivalSum(Node36 node, TreeMap<Integer, Integer> treeMap, int level) {
		if (node == null)
			return;
		vertivalSum(node.left, treeMap, level - 1);
		if (treeMap.get(level) != null) {
			Integer sum = treeMap.get(level) + node.value;
			treeMap.put(level, sum);
		}else {
			treeMap.put(level, node.value);
		}
		vertivalSum(node.right, treeMap, level + 1);
	}
}
public class A036 {
	public static void main(String[] args) {
		Tree36 tree = new Tree36();
		tree.root = new Node36(1);
		tree.root.left = new Node36(2);
		tree.root.right = new Node36(3);
		tree.root.right.left = new Node36(5);
		tree.root.right.right = new Node36(6);
		tree.root.right.left.left = new Node36(7);
		tree.root.right.left.right = new Node36(8);
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		tree.vertivalSum(tree.root, treeMap, 0);
		for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
	}

}
