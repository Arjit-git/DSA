import java.util.*;
public class Tree {

    static Scanner sc = null;
    public static void main(String args[]) {
             sc = new Scanner(System.in);
        createTree();
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
}
class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }
}
