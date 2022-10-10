public class TreeMethods {
    int depth = 1;

    Node addNodeBst(Node rootNode, String data) {
        if (rootNode == null) {
            rootNode = new Node(data);
            return rootNode;
        }
        if (data.compareTo(rootNode.data) > 0) { // data > root data
            rootNode.right = addNodeBst(rootNode.right, data);
            // setting the reference to parent
            rootNode.parent = rootNode;
        } else if (data.compareTo(rootNode.data) < 0) { // data < root data
            rootNode.left = addNodeBst(rootNode.left, data);
            rootNode.parent = rootNode;
        }
        return rootNode;
    }

    // can refactor ? pse do
    int treeDepth(Node rootNode, String key) {
        // initialising the depth as -1 as the level begins from 0
        // searching to find the node.
        // if the tree is empty
        if (rootNode == null) {
            return 0;
        } else if (rootNode.data.equalsIgnoreCase(key)) {
            // the node is the root
            rootNode.searchFrequency += 1;
            return depth;
        } else if (key.compareTo(rootNode.data) > 0) { // data > root data
            depth += 1;
            treeDepth(rootNode.right, key);
        } else if (key.compareTo(rootNode.data) < 0) { // data < root data
            depth += 1;
            treeDepth(rootNode.left, key);
        }
        return depth;
    } // pse change the above function
}
