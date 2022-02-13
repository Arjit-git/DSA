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
}
class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }
}
