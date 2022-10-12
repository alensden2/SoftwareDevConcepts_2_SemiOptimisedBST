/*
 * Node for the binary search tree
 * each node contains data, searchFrequency and reference to the left and right nodes
 * the searchfrequency is initialized as 0
 */
public class Node {
    String data;
    int searchFrequency;
    Node left;
    Node right;
    Node parent;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getSearchFrequency() {
        return searchFrequency;
    }

    public void setSearchFrequency(int searchFrequency) {
        this.searchFrequency = searchFrequency;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.searchFrequency = 0;
    }
}
