import java.util.*;
import java.io.*;
class Node
{
    int key;
    Node left, right;
    public Node(int item)
	{
        key = item;
        left = right = null;
    }
}	
class Monkwatchingfight
{
	Node root,parent;
    Monkwatchingfight()
	{ 
        root = null;
		parent=null;
    }
	void insert(int key) 
	{
       root = insertRec(root, key);
    }
	Node insertRec(Node root, int key)
	{
        if (root == null)
		{
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
			root.right = insertRec(root.right, key);
        return root;
    }
	int maxDepth(Node root) 
    {
        if (root == null)
            return 0;
        else
        {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
  
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
	public static void main(String[] args) throws Exception 
	{
        Monkwatchingfight tree = new Monkwatchingfight();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n=reader.readLine();
		int N=Integer.parseInt(n);
		String[] s = reader.readLine().split(" "); 
		int i,j;
		for(i=0;i<N;i++)
		{
			int noofpasses=Integer.parseInt(s[i]);
			tree.insert(noofpasses);
        }
		System.out.println(tree.maxDepth(tree.root));
    }
}
