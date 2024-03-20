package bst;

public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = new Node(60);
        bst.root = root;
        root.left = new Node(55);
        root.left.left=new Node(45);
        root.left.right=new Node(57);
        root.left.right.right=new Node(59);
        root.right = new Node(100);
        Node node67 = new Node(67);
        root.right.left = node67;
        root.right.right = new Node(107);
        root.right.right.left = new Node(101);

        bst.add(77);

        System.out.println(bst.containsValue(76));
        System.out.println(bst.containsValue(77));
        System.out.println(bst.containsValue(57));

    }
}
