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
            // setting the reference to parent
            rootNode.right.parent = rootNode;
        } else if (data.compareTo(rootNode.data) < 0) { // data < root data
            rootNode.left = addNodeBst(rootNode.left, data);
            // setting the reference to parent
            rootNode.left.parent = rootNode;
        }

        return rootNode;
    }

    // can refactor ? pse do
    Node treeDepth(Node rootNode, String key, int depth, Node oldRoot) {
        // initialising the depth as -1 as the level begins from 0
        // searching to find the node.
        // if the tree is empty
        if (rootNode == null) {
            return oldRoot;
        }
        if ((rootNode.data.compareToIgnoreCase(key) == 0)) {
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
            // no rotation all good
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
    // pse change the above function

    // String printTreeWithDepth(Node root1) {
    // if (root1 != null) {
    // if (root1.left != null) {
    // printTreeWithDepth(root1.left);
    // }
    // String key = root1.data;
    // int depth = treeDepth(root1, key,);
    // System.out.println(depth);
    // if (root1.right != null) {
    // printTreeWithDepth(root1.right);
    // }
    //
    //
    // }
    // return null;
    // }

    Node ifRootNotNull(Node root) {
        if (root.parent != null) {
            ifRootNotNull(root.parent);
        }
        return root;
    }
}
