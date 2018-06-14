import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

class Node38 {
	int value, distance;
	Node38 left, right;
	public Node38(int value) {
		this.value = value;
		distance = Integer.MAX_VALUE;
		left = right = null;
	}
}

class Tree38 {
	Node38 root;
	public void diagonalSum() {
		Stack<Node38> stack = new Stack<Node38>();
		Map<Integer, Integer> map = new TreeMap<>();
		root.distance = 3;
		stack.push(root);
		while (!stack.isEmpty()) {
			Node38 current = stack.pop();
			int distance = current.distance;
			while (current != null) {
				int pSum = (map.get(distance) == null) ? 0 : map.get(distance);
				map.put(distance, pSum + current.value);
				
				if (current.left != null) {
					current.left.distance = distance - 1;
					stack.push(current.left);
				}
				current = current.right;
			}
		}
		Set<Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Entry<Integer, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> m = iterator.next();
			System.out.print(m.getValue() + " ");
		}
	}
}


public class A038 {
	public static void main(String[] args) {
		Tree38 tree = new Tree38();
		tree.root = new Node38(1);
        tree.root.left = new Node38(2);
        tree.root.right = new Node38(3);
        tree.root.left.left = new Node38(4);
        tree.root.right.left = new Node38(5);
        tree.root.right.right = new Node38(6);
        tree.root.right.left.left = new Node38(7);
        tree.root.right.left.right = new Node38(8);
        tree.diagonalSum();
	}
}
