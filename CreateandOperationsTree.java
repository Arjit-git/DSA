import java.util.*;
public class Tree {

    static Scanner sc = null;
    public static void main(String args[]) {
             sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("Inorder Traversal : ");
        inOrder(root);
        System.out.println("\nPreorder Traversal : ");
        preOrder(root);
        System.out.println("\nPostorder Traversal : ");
        postOrder(root);
        System.out.println("\nHeight : \n"+heightOfTree(root));
    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter Data");
        int data = sc.nextInt();

        if(data== -1)
            return null;

        root = new Node(data);
        System.out.println("Enter  Left Node Data for : "+data);
        root.left = createTree();
        System.out.println("Enter Right Node Data for : "+data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
       return  Math.max(heightOfTree(root.left),heightOfTree(root.right)) +1;
    }
    static int sizeOfTree(Node root){
        if(root == null){
            return 0;
        }
        return (sizeOfTree(root.left)+sizeOfTree(root.right)+1);
    }
    static int maxElementOfTree(Node root){
        if(root == null){
            return -1000;
        }
        return Math.max(root.data,Math.max(maxElementOfTree(root.left),maxElementOfTree(root.right)));
    }
  public static boolean is_bst(
      BinaryTreeNode root) {
   
    return is_BST_WITH_Range(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
   static boolean is_BST_WITH_Range(BinaryTreeNode node, int min, int max){
        if(node == null)
            return true;

        if(node.data < min || node.data >max)
            return false;

        return (is_BST_WITH_Range(node.left,min,node.data ) &&
                is_BST_WITH_Range(node.right,node.data,max));
    }

}
class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }
}
