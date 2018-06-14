import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

class Node31 {
	int value, distance;
	Node31 left, right;
	public Node31(int value) {
		this.value = value;
		distance = Integer.MAX_VALUE;
		left = right = null;
	}
}

class Tree31 {
	Node31 root;
	public Tree31(Node31 node) {
		root = node;
	}
	public void bottomView() {
		if (root == null)
			return;
		int distance = 0;
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Node31> queue = new LinkedList<Node31>();
		root.distance = distance;
		queue.add(root);
		while (!queue.isEmpty()) {
			Node31 temp = queue.remove();
			distance = temp.distance;
			map.put(distance, temp.value);
			if (temp.left != null) {
				temp.left.distance = distance - 1;
				queue.add(temp.left);
			}
			if (temp.right != null) {
				temp.right.distance = distance + 1;
				queue.add(temp.right);
			}
		}
		Set<Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> me = iterator.next();
			System.out.print(me.getValue() + " ");
		}
	}
}

public class A031 {
	public static void main(String[] args) {
		Node31 root = new Node31(1);
		root.left = new Node31(2);
		root.right = new Node31(3);
		root.right.left = new Node31(5);
		root.right.right = new Node31(6);
		root.right.left.left = new Node31(7);
		root.right.left.right = new Node31(8);
		Tree31 tree = new Tree31(root);
		tree.bottomView();
	}
}
