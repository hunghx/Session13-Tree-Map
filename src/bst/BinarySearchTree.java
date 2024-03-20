package bst;

public class BinarySearchTree {
    Node root;


    // thêm mới đệ qui
    private Node addRecursive(Node current, int value) {
        if (current == null) { // node gốc
            return new Node(value); // tr về node về thêm mơi
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        this.root = addRecursive(root, value);
    }

    private boolean searchRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }
//        if (current.value > value){
//            return searchRecursive(current.left,value);
//        }else {
//            return searchRecursive(current.right,value);
//        }
        return current.value > value ? searchRecursive(current.left, value)
                : searchRecursive(current.right, value);
    }

    public boolean containsValue(int value) {
        return searchRecursive(root, value);
    }

}
