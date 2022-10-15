/**
 * STUDENT DETAILS
 * 
 * Name - Alen Santosh John
 * Email - al283652@dal.ca
 * Banner ID - B00930528
 * Assignment 2 - Binary Search Trees
 * 
 */

/** 
 * Node.java - Class file for a node
 */

/**
 * CLASS DESCRIPTION
 * 
 * Node for the binary search tree
 * each node contains data, searchFrequency and reference to the left and right
 * nodes
 * The nodes also refer the previous parent
 * the searchfrequency is initialized as 0
 * 
 */

/**
 * CONSTRUCTORS AND METHODS
 * 
 * 1. Constructor - initializes a key for the node
 * 
 */

public class Node {
    String data;
    int searchFrequency;
    Node left;
    Node right;
    Node parent;

    Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.searchFrequency = 0;
    }
}
