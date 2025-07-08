package CodeWithInfy;

public class TraversalTree {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }
    
    public static void inorder(Node root) {
    	if (root == null)
            return;
        postorder(root.left);   
        System.out.print(root.data + " ");
        postorder(root.right);  
    }
    public static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);   
        postorder(root.right);  
        System.out.print(root.data + " "); 
    }
    
    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " "); 
        postorder(root.left);   
        postorder(root.right);  
    }
    


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Postorder Traversal: ");
        postorder(root);
        System.out.println("\nInorder Traversal: ");
        inorder(root);
        System.out.println("\nPreorder Traversal: ");
        preorder(root);
        
    }
}
