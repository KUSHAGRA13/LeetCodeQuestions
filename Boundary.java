import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boundary {

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public static void main (String args[]) {
        Node root = new Node(20,null,null);
        root.left = new Node(8,null,null);
        root.right = new Node(22,null,null);
        root.left.left = new Node(4,null,null);
        root.left.right = new Node(12,null,null);
        root.left.right.left = new Node(10,null,null);
        root.left.right.right = new Node(14,null,null);
        root.right.right = new Node(25,null,null);
    }

    public static List<Integer> leftTraversal(Node root) {
        List<Integer> lst = new ArrayList<>();
        Node leftTraversal = root;
        while(leftTraversal!=null) {
            lst.add(root.value);
            leftTraversal = leftTraversal.left;
        }
        return lst;
    }

    public static List<Integer> rightTraversal(Node root) {
        List<Integer> lst = new ArrayList<>();
        Node rightTraversal = root.right;
        while(rightTraversal !=null) {
            lst.add(root.value);
            rightTraversal = rightTraversal.right;
        }
        return lst;
    }

    public static List<Integer> leafNode(Node root) {
        List<Integer> lst = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st!=null) {
            Node n = st.peek();
            if(n.left != null && isLeafNode(n.left)){
                lst.add(n.left.value);
            }
            else {

            }
        }
        return lst;
    }

    private static boolean isLeafNode(Node node) {
        if(node.left == null && node.right == null)
            return true;
        else
            return false;
    }
}
