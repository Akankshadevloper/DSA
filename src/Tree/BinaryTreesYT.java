package Tree;

import com.sun.source.tree.BinaryTree;
import java.util.*;

public class BinaryTreesYT {
    static class Node {
        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
//( PRE ORDER TRAVERSAL ) TIME COMPLEXITY- O(n)

    //public static void preorder(Node root) {
    //       if(root == null) {
    //           System.out.print(-1+" ");
    //           return;
    //       }
    //       System.out.print(root.data+" ");
    //       preorder(root.left);
    //       preorder(root.right);
    //   }


    //( IN ORDER TRAVERSAL ) Time Complexity - O(n)
    //public static void inorder(Node root) {
    //       if(root == null) {
    //           System.out.print(-1+" ");
    //           return;
    //       }
    //       inorder(root.left);
    //       System.out.print(root.data+" ");
    //       inorder(root.right);
    //   }



    //(POST ORDER TRAVERSAL)
    // public static void postorder(Node root) {
    //       if(root == null) {
    //           System.out.print(-1+" ");
    //           return;
    //       }
    //       postorder(root.left);
    //       postorder(root.right);
    //       System.out.print(root.data+" ");
    //   }






    //LEVEL ORDER TRAVERSAL
    //public static void levelOrder(Node root) {
    //       if(root == null) {
    //           return;
    //       }
    //       Queue<Node> q = new LinkedList<>();
    //       q.add(root);
    //       q.add(null);
    //       while(!q.isEmpty()) {
    //           Node curr = q.remove();
    //           if(curr == null) {
    //               System.out.println();
    //               //queue empty
    //               if(q.isEmpty()) {
    //                   break;
    //               } else {
    //                   q.add(null);
    //               }
    //           } else {
    //               System.out.print(curr.data+" ");
    //               if(curr.left != null) {
    //                   q.add(curr.left);
    //               }
    //               if(curr.right != null) {
    //                   q.add(curr.right);
    //               }
    //           }
    //       }
    //   }




    // COUNT OF NODES ( time complexity - O(N) )
    //public static int countOfNodes(Node root) {
    //       if(root == null) {
    //           return 0;
    //       }
    //
    //
    //       int leftNodes = countOfNodes(root.left);
    //       int rightNodes = countOfNodes(root.right);
    //       return leftNodes + rightNodes + 1;
    //   }




    //SUM OF THE NODE
    //public static int sumOfNodes(Node root) {
    //       if(root == null) {
    //           return 0;
    //       }
    //
    //
    //       int leftSum = sumOfNodes(root.left);
    //       int rightSum = sumOfNodes(root.right);
    //       return leftSum + rightSum + root.data;
    //   }



    // HEIGHT OF THE TREE (time complexity = O(n) because we are traversing each node one time )
    //public static int height(Node root) {
    //       if(root == null) {
    //           return 0;
    //       }
    //
    //
    //       int leftHeight = height(root.left);
    //       int rightHeight = height(root.right);
    //       return Math.max(leftHeight, rightHeight) + 1;
    //}





     // DIAMETER OF THE TREE  O(N)
    // public static TreeInfo diameter(Node root) {
    //       if(root == null) {
    //           return new TreeInfo(0, 0);
    //       }
    //
    //
    //       TreeInfo leftTI = diameter(root.left);
    //       TreeInfo rightTI = diameter(root.right);
    //
    //
    //       int myHeight = Math.max(leftTI.height, rightTI.height) + 1;
    //
    //
    //       int diam1 = leftTI.height + rightTI.height + 1;
    //       int diam2 = leftTI.diam;
    //       int diam3 = rightTI.diam;
    //
    //
    //       int myDiam = Math.max(diam1, Math.max(diam2, diam3));
    //
    //
    //       return new TreeInfo(myHeight, myDiam);
    //   }




    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        // inorder(root);
        //preorder(root);
        //postorder(root);
        //levelOrder(root);

        //System.out.println(countOfNodes(root));
        //System.out.println(sumOfNodes(root));
        //System.out.println(height(root));
        //System.out.println(diameter(root));
    }
}