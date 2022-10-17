/**
 * Software Development Concepts
 * 
 * @author Alen Santosh John
 * @author B00930528
 * 
 *         This class is a helper class for the treeMethod class, this class
 *         decides on
 *         whether the tree has to be left rotates, right rotated or no rotation
 *         is performed
 * 
 */

public class SearchTree {
    Node rootNode; // instance of node class
    DynamicArray arrayOfNodes = new DynamicArray(100); // initialised size to 50
    TreeMethods treeMethods = new TreeMethods();
    Node root = rootNode;

    SearchTree() {
        rootNode = null;
    }

    /**
     * Returns true if the add method successfully added a new node.
     * This method first checks if the element already exists, if not, the node
     * is added and true is returned
     * 
     * @param key node key
     * @return
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

    /**
     * Returns the depth for a given key if the item exists in the dynamic array
     * 
     * @param key string
     * @return depth int
     */
    int find(String key) {
        int depth = 0;
        if ((key == null) || (key == "")) {
            return 0;
        } else if (arrayOfNodes.getIndexOfElement(key) != -2) {
            // rootNode = treeMethods.ifRootNotNull(rootNode);
            // depth
            depth = treeMethods.findDepthNode(key, rootNode);
            Node oldRoot = rootNode;
            rootNode = treeMethods.rotateTree(rootNode, key, 1, oldRoot);
            return depth;
        }
        return depth;
    }

    /**
     * resets the tree, sets the search frequency to zero
     */
    void reset() {
        treeMethods.resetCurrentStateTree(rootNode);
    }

    /**
     * Prints the node key and the depth of the current tree.
     * 
     * @return treeContent String
     */
    String printTree() {
        String treeContent = treeMethods.printCurrentTreeNodes(rootNode);
        treeMethods.resetCurrentTreeStatePrint();
        if (treeContent == null || treeContent == "") {
            return null;
        }
        return treeContent;
    }

}
