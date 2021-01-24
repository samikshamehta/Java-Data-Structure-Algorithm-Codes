package lect_tree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode<T>{
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	BinaryTreeNode(T data){
		this.data = data;
	}
}
public class BinaryTreePractise {

	<T> int heightUsingQueue(BinaryTreeNode<T> root){
		if(root==null){
			return 0;
		}
		LinkedList<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
		queue.addLast(root);
		queue.addLast(null);
		int count = 0;
		while(!queue.isEmpty()){
			BinaryTreeNode<T> currentNode = queue.removeFirst();
			if(currentNode==null){
				count++;
				if(queue.isEmpty()){
					return count;
				}
				queue.addLast(null);
				continue;
			}
			if(currentNode.left!=null){
				queue.addLast(currentNode.left);
			}
			
			if(currentNode.right!=null){
				queue.addLast(currentNode.right);
			}
			
		}
		return count;
	}
	
	
	
	
	
	<T>int diameter(BinaryTreeNode<T> root){
		if(root==null){
			return 0;
		}
		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);
		int x = height(root.left)+height(root.right)+1;
		return Math.max(Math.max(leftDiameter, rightDiameter),x);
	}
	
	<T>DiameterType diameterBetter(BinaryTreeNode<T> root){
		if(root==null){
			return new DiameterType(0, 0);
		}
		DiameterType leftType = diameterBetter(root.left);
		DiameterType rightType = diameterBetter(root.right);
		int x = leftType.height+rightType.height+1;
		int currentDiameter= Math.max(Math.max(leftType.diameter, rightType.diameter),x);
		int currentHeight = Math.max(leftType.height,rightType.height)+1;
		return new DiameterType(currentHeight, currentDiameter);
	}
	
	
	static int preOrderIndex = 0;
	static  BinaryTreeNode<Integer> constructTreeUsingInPre(int[] inOrder, int[] preOrder, int start, int end){
		if(start>end){
			return null;
		}
		if(start==end){
			BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[preOrderIndex]);	
			preOrderIndex++;
			return root;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[preOrderIndex]);
		
		
		int index = search(inOrder,preOrder[preOrderIndex], start,end);
		preOrderIndex++;
		root.left = constructTreeUsingInPre(inOrder, preOrder,start,index-1);
		root.right = constructTreeUsingInPre(inOrder, preOrder,index+1,end);
		return root;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
class DiameterType{
	int height;
	int diameter;
	DiameterType(int height, int diameter){
		this.height = height;
		this.diameter = diameter;
	}
}












