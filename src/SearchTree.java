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
 * SearchTree.java - Class file for Search Tree
 */

/**
 * CLASS DESCRIPTION
 * 
 * Consists of all the pre-defined methods as mentioned in the assignment. This class calls on the
 * Helper class named treeMethods. This class helps in add, find, reset and print tree.
 * 
 */

/**
 * CONSTRUCTORS AND METHODS
 * 
 * 1. Constructor - initializes a null root node
 * 2. add(String key) - @param - String; @return - boolean
 * 3. find(String key) - @param - String @return - int
 * 4. reset()
 * 5. printTree() - @return - String
 */

public class SearchTree {
    Node rootNode; // instance of node class
    DynamicArray arrayOfNodes = new DynamicArray(100); // initialised size to 50
    TreeMethods treeMethods = new TreeMethods();
    Node root = rootNode;

    SearchTree() {
        rootNode = null;
    }

    /*
     * Method 1 - adds key to tree
     * Input - String key
     * 
     * @return - boolean
     */
    boolean add(String key) {
        if (key == null || key == "") {
            return false;
        } else {
            if (arrayOfNodes.getIndexOfElement(key) == -2) { // This checks if the key already exists in the tree
                rootNode = treeMethods.addNodeBst(rootNode, key);
                arrayOfNodes.addElement(key);
                return true;
            }
            return false;
        }
    }

    //
    void inorder() {
        inorder_Recursive(rootNode);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.data + " " + root.searchFrequency + "\n");
            inorder_Recursive(root.right);
        }
    }
    //

    /*
     * Method 2 - searches for key
     * Input - String key
     * Return - int (depth of key)
     */
    int find(String key) {
        if ((key == null) || (key == "")) {
            return 0;
        } else if (arrayOfNodes.getIndexOfElement(key) != -2) {
            // rootNode = treeMethods.ifRootNotNull(rootNode);
            // depth
            Node oldRoot = rootNode;
            rootNode = treeMethods.rotateTree(rootNode, key, 1, oldRoot);
            return 1;// return
        }
        return 0;
    }

    /*
     * Method 3 - changes counters to 0
     */
    void reset() {

        if (root != null) {
            inorder_Recursive(root.left);
            root.searchFrequency = 0;
            inorder_Recursive(root.right);
        }
    }

    /*
     * Method 4 - creates string of trees content
     * Return - String (key depth)
     */
    String printTree() {
        String treeContent = "";
        return treeContent;
    }
}
