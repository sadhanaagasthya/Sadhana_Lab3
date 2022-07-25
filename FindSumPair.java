package com.gl.treesum;
import java.util.*;

 class FindSumPair {

	public Node insert(Node root, int key) 
		{
		 if(root==null)
			return new Node(key);
		if(key<root.nodeData)
			root.left=insert(root.left,key);
		else
			root.right=insert(root.right,key);
		
		return root;
	}
      
	public boolean findPairUtil(Node root,int sum,HashSet<Integer> set) 
	{
		if(root==null)
			return false;
		
		if (findPairUtil(root.left,sum,set))
			return true;
		
		if(set.contains(sum-root.nodeData)) {
			System.out.println("pair is found("
					+(sum-root.nodeData)+","
					+root.nodeData+")");
			return true;
		}
		else
			set.add(root.nodeData);
		
		return findPairUtil(root.right,sum,set);
		
		}

	public void findPairWithGivenSum(Node root, int sum) 
	{
		
		HashSet<Integer> set= new HashSet<Integer>();
		if(!findPairUtil(root,sum,set))
			System.out.println("pairs do not exist"+"\n");
	}
 	
 }	
 
	
	
	
	
	
	
		
	


