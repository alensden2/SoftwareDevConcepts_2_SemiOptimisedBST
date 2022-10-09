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

    Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.searchFrequency = 0;
    }
}
