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
    int treeDepth(Node rootNode, String key) {
        // initialising the depth as -1 as the level begins from 0
        // searching to find the node.
        // if the tree is empty
        int depth = 0;
        if (rootNode == null) {
            return 0;
        }
        if ((rootNode.data.compareToIgnoreCase(key) == 0) || (depth = treeDepth(rootNode.left, key)) >= 0 || (depth = treeDepth(rootNode.right, key)) >= 0) {

            if ((rootNode.data.compareToIgnoreCase(key) == 0)
            ) {
                rootNode.searchFrequency += 1;
                checkForRotation(rootNode);
            }

            return depth + 1;
        }
        return depth;
    }

    void checkForRotation(Node rootNode) {
        if (rootNode.parent == null) {
            System.out.println("no rotation");
            // no rotation all good
        } else if (rootNode.parent.parent == null) {
            Node rotateNode = rootNode.parent;
            Node rotateNodeParent = new Node(null);
            Node rotateNodeChild = rootNode;
            rotateTree.isRotateRequired(rotateNode, rotateNodeParent, rotateNodeChild);
        } else {
            Node rotateNode = rootNode.parent;
            Node rotateNodeParent = rootNode.parent.parent;
            Node rotateNodeChild = rootNode;
            rotateTree.isRotateRequired(rotateNode, rotateNodeParent, rotateNodeChild);
        }
    }
    // pse change the above function

    String printTreeWithDepth(Node root1) {
        if (root1 != null) {
            if (root1.left != null) {
                printTreeWithDepth(root1.left);
            }
            String key = root1.data;
            int depth = treeDepth(root1, key);
            System.out.println(depth);
            if (root1.right != null) {
                printTreeWithDepth(root1.right);
            }


        }
        return null;
    }

    Node ifRootNotNull(Node root){
        if(root.parent != null){
            ifRootNotNull(root.parent);
        }
        return root;
    }
}
