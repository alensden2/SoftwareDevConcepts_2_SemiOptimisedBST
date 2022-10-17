/**
 * Software Development Concepts
 * 
 * @author Alen Santosh John
 * @author B00930528
 * 
 *         This class is a helper class for the SearchJava.java file. This class
 *         provides with various methods liketo add a new node to the tree,
 *         increase the
 *         search frequency, rotation checks, finding the depth, printing the
 *         tree and reseting the tree. This class can be only accessed from the
 *         SearchTree.java class
 * 
 */

public class TreeMethods {
    RotateTree rotateTree = new RotateTree();
    int depth = 1;
    int depthOfNode = 1;
    int depthOfNode1 = 0;
    String line = "";
    Node currentStateTree;

    /**
     * Returns the root node after adding the new node to the tree. The key
     * of the node is compared with the key of the root and if the given key
     * is greater the new node is added to the right subtree and vice versa
     * 
     * @param rootNode - the root node (Node Object)
     * @param data     - the given key for the new node
     * @return rootNode
     */
    Node addNodeBst(Node rootNode, String data) {
        if (rootNode == null) {
            rootNode = new Node(data);
            return rootNode;
        }
        if (data.compareToIgnoreCase(rootNode.data) > 0) { // data > root data
            rootNode.right = addNodeBst(rootNode.right, data);
            rootNode.right.parent = rootNode; // setting the reference to parent
        } else if (data.compareToIgnoreCase(rootNode.data) < 0) { // data < root data
            rootNode.left = addNodeBst(rootNode.left, data);
            rootNode.left.parent = rootNode; // setting the reference to parent
        }
        currentStateTree = rootNode;

        return rootNode;
    }

    /**
     * This method is called by the find method in the SearchTree.java. The method
     * traverses the tree to find the key ( @param key ). The value of the search
     * frequency for the node is increased. This is then passed to the
     * "checkForRotation"
     * method
     * 
     * @param rootNode rootNode (Node Object)
     * @param key      element to be searched (String)
     * @param depth    depth (int)
     * @param oldRoot  oldRoot (Node Object)
     * @return oldRoot
     */
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

    /**
     * This method checks if the node is eligible to be rotated, i.e - if the root
     * node is the root of the tree, if the node will be the root after rotation, or
     * if the rotation is normal
     * 
     * @param rootNode rootNode (Node Object)
     * @param oldRoot  oldRoot (Node Object)
     * @return oldroot
     */
    Node checkForRotation(Node rootNode, Node oldRoot) {
        if (rootNode.parent == null) {
            // no rotation
            ;
        } else if (rootNode.parent.parent == null) { // if the rotation will cause a root change
            Node rotateNode = rootNode.parent;
            Node rotateNodeChild = rootNode;
            Node nodeChanged = rotateTree.isRotateRequired(rotateNode, rotateNodeChild, oldRoot);
            return nodeChanged;
        } else { // normal scenerio
            Node rotateNode = rootNode.parent;
            Node rotateNodeChild = rootNode;
            oldRoot = rotateTree.isRotateRequired(rotateNode, rotateNodeChild, oldRoot);
            return oldRoot;
        }
        return oldRoot;
    }

    /**
     * Returns the depth for a given key. This method is called by the find method
     * in the SearchTree.java
     * 
     * @param key         element to be searched (String)
     * @param currentTree the current tree (Node Object)
     * @return depth (int)
     */
    int findDepthNode(String key, Node currentTree) {
        if (currentTree == null) {
            return 0;
        } else if (key.compareToIgnoreCase(currentTree.data) > 0) { // data > root
            depthOfNode++;
            findDepthNode(key, currentTree.right);
        } else if (key.compareToIgnoreCase(currentTree.data) < 0) { // data < root
            depthOfNode++;
            findDepthNode(key, currentTree.left);
        } else if (key.compareToIgnoreCase(currentTree.data) == 0) {
            depthOfNode1 = depthOfNode;
            depthOfNode = 1;
            return depthOfNode1;
        }

        return depthOfNode1;
    }

    /**
     * Returns a string with the node key and depth. This method is called by
     * printTree in searchTree.java
     * 
     * @param currentNode the current tree (Node Object)
     * @return (String)
     */
    String printCurrentTreeNodes(Node currentNode) {

        if (currentNode != null) {
            printCurrentTreeNodes(currentNode.left);
            depth = findDepthNode(currentNode.data, currentStateTree);
            line = line + (currentNode.data + " " + depth + "\n"); // prints the key and depth and a new line
            printCurrentTreeNodes(currentNode.right);
        }
        return line;
    }

    /**
     * This method is a helper function for the printTree methods, due to recursion
     * after each recursion the previous data remains redudant this resets the
     * string to empty before the next call
     * 
     */
    void resetCurrentTreeStatePrint() {
        line = "";
    }

    /**
     * This method resets the search frequency for all the nodes to zero. This is
     * called from the searchTree.java by reset method
     * 
     * @param currentNode
     */
    void resetCurrentStateTree(Node currentNode) {
        if (currentNode != null) {
            resetCurrentStateTree(currentNode.left);
            currentNode.searchFrequency = 0; // resets the search frequency to zero
            resetCurrentStateTree(currentNode.right);
        }
    }
}
