/**
 * STUDENT DETAILS
 *
 *  Name - Alen Santosh John
 * Email - al283652@dal.ca
 * Banner ID - B00930528
 * Assignment 2 - Binary Search Trees
*/

/**
 *  RotateTree.java - Class file for a dynamic array of strings
*/

/**
 * CLASS DESCRIPTION
 *
 * 
 */

/**
 * CONSTRUCTORS AND METHODS
 * 
 * 1. Constructor - initializes the size of the array
 * 2.
 */
public class TreeMethods {
    RotateTree rotateTree = new RotateTree();
    int depth = 1;
    Node rootNode;

    Node addNodeBst(Node rootNode, String data) {
        if (rootNode == null) {
            rootNode = new Node(data);
            return rootNode;
        }
        if (data.compareTo(rootNode.data) > 0) { // data > root data
            rootNode.right = addNodeBst(rootNode.right, data);
            rootNode.right.parent = rootNode; // setting the reference to parent
        } else if (data.compareTo(rootNode.data) < 0) { // data < root data
            rootNode.left = addNodeBst(rootNode.left, data);
            rootNode.left.parent = rootNode; // setting the reference to parent
        }
        return rootNode;
    }

    Node treeDepth(Node rootNode, String key, int depth, Node oldRoot) {
        if (rootNode == null) { // If the tree is empty
            return oldRoot;
        }
        if ((rootNode.data.compareToIgnoreCase(key) == 0)) { // In case the root node is the element searched
            rootNode.searchFrequency += 1;
            rootNode = checkForRotation(rootNode, oldRoot);
            return rootNode;
        }
        if (rootNode.left != null) {
            oldRoot = treeDepth(rootNode.left, key, depth + 1, oldRoot);
        }
        if (rootNode.right != null) {
            oldRoot = treeDepth(rootNode.right, key, depth + 1, oldRoot);
        }

        return oldRoot;
    }

    Node checkForRotation(Node rootNode, Node oldRoot) {
        if (rootNode.parent == null) {
            System.out.println("no rotation");
        } else if (rootNode.parent.parent == null) {
            Node rotateNode = rootNode.parent;
            Node rotateNodeParent = new Node(null);
            Node rotateNodeChild = rootNode;
            Node nodeChanged = rotateTree.isRotateRequired(rotateNode, rotateNodeParent, rotateNodeChild, oldRoot);
            return nodeChanged;
        } else {
            Node rotateNode = rootNode.parent;
            Node rotateNodeParent = rootNode.parent.parent;
            Node rotateNodeChild = rootNode;
            oldRoot = rotateTree.isRotateRequired(rotateNode, rotateNodeParent, rotateNodeChild, oldRoot);
            return oldRoot;
        }
        return oldRoot;
    }

    Node ifRootNotNull(Node root) {
        if (root.parent != null) {
            ifRootNotNull(root.parent);
        }
        return root;
    }
}
