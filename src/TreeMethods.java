/**
 * STUDENT DETAILS
 * <p>
 * Name - Alen Santosh John
 * Email - al283652@dal.ca
 * Banner ID - B00930528
 * Assignment 2 - Binary Search Trees
 * <p>
 * RotateTree.java - Class file for a dynamic array of strings
 * <p>
 * CLASS DESCRIPTION
 * <p>
 * RotateTree.java - Class file for a dynamic array of strings
 * <p>
 * CLASS DESCRIPTION
 * <p>
 * RotateTree.java - Class file for a dynamic array of strings
 * <p>
 * CLASS DESCRIPTION
 * <p>
 * RotateTree.java - Class file for a dynamic array of strings
 * <p>
 * CLASS DESCRIPTION
 * <p>
 * RotateTree.java - Class file for a dynamic array of strings
 * <p>
 * CLASS DESCRIPTION
 * <p>
 * RotateTree.java - Class file for a dynamic array of strings
 * <p>
 * CLASS DESCRIPTION
 * <p>
 * RotateTree.java - Class file for a dynamic array of strings
 * <p>
 * CLASS DESCRIPTION
 * <p>
 * RotateTree.java - Class file for a dynamic array of strings
 * <p>
 * CLASS DESCRIPTION
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
    int depthOfNode = 1;
    int depthOfNode1 = 0;
    String line = "";
    Node currentStateTree;

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
        currentStateTree = rootNode;

        return rootNode;
    }

    Node rotateTree(Node rootNode, String key, int depth, Node oldRoot) {
        if (rootNode == null) { // If the tree is empty
            return oldRoot;
        }
        if ((rootNode.data.compareToIgnoreCase(key) == 0)) { // In case the root node is the element searched
            rootNode.searchFrequency += 1;
            rootNode = checkForRotation(rootNode, oldRoot);
            return rootNode;
        }
        if (rootNode.left != null) {
            oldRoot = rotateTree(rootNode.left, key, depth + 1, oldRoot);
        }
        if (rootNode.right != null) {
            oldRoot = rotateTree(rootNode.right, key, depth + 1, oldRoot);
        }
        currentStateTree = oldRoot;
        return oldRoot;
    }

    Node checkForRotation(Node rootNode, Node oldRoot) {
        if (rootNode.parent == null) {
            System.out.println("no rotation");
        } else if (rootNode.parent.parent == null) {
            Node rotateNode = rootNode.parent;
            Node rotateNodeChild = rootNode;
            Node nodeChanged = rotateTree.isRotateRequired(rotateNode, rotateNodeChild, oldRoot);
            return nodeChanged;
        } else {
            Node rotateNode = rootNode.parent;
            Node rotateNodeChild = rootNode;
            oldRoot = rotateTree.isRotateRequired(rotateNode, rotateNodeChild, oldRoot);
            return oldRoot;
        }
        return oldRoot;
    }

    int findDepthNode(String key, Node currentTree) {
        if (currentTree == null) {
            return 0;
        } else if (key.compareToIgnoreCase(currentTree.data) > 0) { // data.compareTo(rootNode.data) > 0 || data > root
            // data
            depthOfNode++;
            findDepthNode(key, currentTree.right);
        } else if (key.compareToIgnoreCase(currentTree.data) < 0) { // data.compareTo(rootNode.data) < 0) || data < root
            // data
            depthOfNode++;
            findDepthNode(key, currentTree.left);
        } else if (key.compareToIgnoreCase(currentTree.data) == 0) {
            depthOfNode1 = depthOfNode;
            depthOfNode = 1;
            return depthOfNode1;
        }

        return depthOfNode1;
    }

    String printCurrentTreeNodes(Node currentNode) {

        if (currentNode != null) {
            printCurrentTreeNodes(currentNode.left);
            depth = findDepthNode(currentNode.data, currentStateTree);
            line = line + (currentNode.data + " " + depth + "\n");
            printCurrentTreeNodes(currentNode.right);
        }
        return line;
    }

    void resetCurrentTreeStatePrint() {
        line = "";
    }

    void resetCurrentStateTree(Node currentNode) {
        if (currentNode != null) {
            resetCurrentStateTree(currentNode.left);
            currentNode.searchFrequency = 0;
            resetCurrentStateTree(currentNode.right);
        }
    }
}
