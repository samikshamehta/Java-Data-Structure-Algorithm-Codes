package topic_12binarytree;

import java.util.Scanner;

import topic10_stackandqueues.queues.QueueUnderFlowException;
 class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class BinTreUse {




	private static Scanner s = new Scanner(System.in);


	// Take Input
	public static BinaryTreeNode<Integer> takeInput_R() {
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData != -1) {
			BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
			root.left = takeInput_R();
			root.right = takeInput_R();
			return root;
		}
		return null;
	}
	


	// In, Pre, Post Order
	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		printTree(root.left);
		System.out.print(root.data + " ");
		printTree(root.right);

	}
	
	//height
	public static int height(BinaryTreeNode<Integer> root) {
		return root == null ? 0 : Math.max(height(root.left),
				height(root.right)) + 1;
	}
	//Search
	public static BinaryTreeNode<Integer> search(BinaryTreeNode<Integer> root,
			Integer data) {
		if (root == null) {
			return null;
		}
		if (root.data.equals(data)) {
			return root;
		}
		BinaryTreeNode<Integer> result = search(root.left, data);
		if (result == null) {
			result = search(root.right, data);
		}
		return result;
	}
	//mirror
	public static void mirror(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		BinaryTreeNode<Integer> temp;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirror(root.left);
		mirror(root.right);
	}

	
	public static BinaryTreeNode<Integer> takeInput_LevelWise()
			throws QueueUnderFlowException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data: ");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		QueueUsingLinkedList<BinaryTreeNode<Integer>> queue = new QueueUsingLinkedList<>();
		queue.enqueue(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = queue.dequeue();
			System.out.println("Enter left child: ");
			int leftChildData = s.nextInt();
			if (leftChildData != -1) {
				currentNode.left = new BinaryTreeNode<>(leftChildData);
				queue.enqueue(currentNode.left);
			}

			System.out.println("Enter right child: ");
			int rightChildData = s.nextInt();

			if (rightChildData != -1) {
				currentNode.right = new BinaryTreeNode<>(rightChildData);
				queue.enqueue(currentNode.right);
			}

		}
		return root;
	}

}
