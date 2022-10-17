/**
 * Software Development Concepts
 * 
 * @author Alen Santosh John
 * @author B00930528
 * 
 *         Node for the binary search tree each node contains data,
 *         searchFrequency and reference to the left and right nodes
 *         The nodes also refer the previous parent the searchfrequency
 *         is initialized as 0
 *         References -
 * @link - https://www.javatpoint.com/binary-tree-java
 */

public class Node {
    String data;
    int searchFrequency;
    Node left;
    Node right;
    Node parent;

    /**
     * Creates a Node object and sets the data to data
     * 
     * @param data the key that is passed to the node
     */
    Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.searchFrequency = 0;
    }
}
