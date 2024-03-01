package com.navr.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BSTNode {
   BSTNode left, right;
   int data;
   public BSTNode(int n) {
      left = null;
      right = null;
      data = n;
   }
}
public class BST {
   static BSTNode root;
   public BST() {
      root = null;
   }

   // Inorder traversal
   private BSTNode insert(BSTNode node, int data) {
      if(node == null)
         node = new BSTNode(data);
      else {
         if(data <= node.data)
            node.left = insert(node.left, data);
         else
            node.right = insert(node.right, data);
      }
      return node;
   }

   // Inorder traversal
   private boolean search(BSTNode r, int val) {
      boolean found = false;
      while ((r != null) && !found) {
         int rval = r.data;
         if(val < rval)
            r = r.left;
         else if (val > rval)
            r = r.right;
         else {
            found = true;
            break;
         }
         found = search(r, val);
      }
      return found;
   }

   // Inorder traversal
   void printTree(BSTNode node, String prefix) {
      if(node == null)
         return;
      printTree(node.left , " " + prefix);
      System.out.print(prefix + "--" + node.data + " ");
      printTree(node.right , prefix);
   }

   // Breadth first search
   public ArrayList<Integer> bfs() {
      if (root==null) return null;
      ArrayList<Integer> outList = new ArrayList<>();
      Queue<BSTNode> nodesQ = new LinkedList<>();
      nodesQ.add(root);
      BSTNode tmpNode = root;
      while(!nodesQ.isEmpty()) {
         BSTNode removedNode = nodesQ.remove();
         outList.add(removedNode.data);
         if (removedNode.left!=null) {
            nodesQ.add(removedNode.left);
         }
         if (removedNode.right!=null) {
            nodesQ.add(removedNode.right);
         }
      }
      System.out.printf("breadthFirstSearch: outList=%s%n", outList);
      return outList;
   }

   public ArrayList<Integer> dfsPreOrder() {
      ArrayList<Integer> outList = new ArrayList<>();

      class Traverse {
         Traverse(BSTNode node) {
            outList.add(node.data);
            if (node.left!=null) {
               new Traverse(node.left);
            }
            if (node.right!=null) {
               new Traverse(node.right);
            }
         }
      }

      new Traverse(root);

      System.out.printf("dfsPreOrder: outList --> %s%n", outList);
      return outList;
   }

   public ArrayList<Integer> dfsPostOrder() {
      ArrayList<Integer> outList = new ArrayList<>();

      class Traverse {
         Traverse(BSTNode n) {
            if (n.left!=null) {
               new Traverse(n.left);
            }
            if (n.right!=null) {
               new Traverse(n.right);
            }
            outList.add(n.data);
         }
      }

      new Traverse(root);

      System.out.printf("dfsPostOrder: outList --> %s%n", outList);
      return outList;

   }

   public ArrayList<Integer> dfsInOrder() {
      ArrayList<Integer> outList = new ArrayList<>();

      class Traverse {
         Traverse (BSTNode n) {
            if (n.left!=null) {
               new Traverse(n.left);
            }
            outList.add(n.data);
            if (n.right!=null) {
               new Traverse(n.right);
            }
         }
      }

      new Traverse(root);

      System.out.printf("dfsInOrder: outList --> %s%n", outList);
      return outList;
   }

   public static void main(String args[]) {
//      Scanner sc = new Scanner(System.in);
      BST bst = new BST();
      root = bst.insert(root, 47);
      root = bst.insert(root, 21);
      root = bst.insert(root, 76);
      root = bst.insert(root, 18);
      root = bst.insert(root, 27);
      root = bst.insert(root, 52);
      root = bst.insert(root, 82);
//      root = bst.insert(root, 65);
      System.out.print("Insertion Done");
	  System.out.print("\nBST:\n");
      bst.printTree(root, "");
      System.out.print("\n\n");
//      int ele = 80;
//      System.out.print("\nElement to be searched: " + ele);
//      System.out.println("\nElement found: " + bst.search(root, 80));

//      bst.bfs();

      bst.dfsPreOrder();

      bst.dfsPostOrder();

      bst.dfsInOrder();

   }
}