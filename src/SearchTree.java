public class SearchTree {
    // instance of node class
    Node rootNode;
    // initialised size to 100
    DynamicArray arrayOfNodes = new DynamicArray(100);

    SearchTree() {
        rootNode = null;
    }

    /*
     * Method 1 - adds key to tree
     * Input - String key
     * Return - boolean
     */
    boolean add(String key) {
        if (key == null || key == "") {
            return false;
        } else {
            // if the tree is empty
            rootNode = addNodeBst(rootNode, key);
            return true;
        }
    }


    Node addNodeBst(Node rootNode, String data) {
        if (rootNode == null) {
            rootNode = new Node(data);
            return rootNode;
        }
        if (data.compareTo(rootNode.data) > 0) { // data > root data
            rootNode.right = addNodeBst(rootNode.right, data);
        } else if (data.compareTo(rootNode.data) < 0) { // data < root data
            rootNode.left = addNodeBst(rootNode.left, data);
        }
        return rootNode;
    }

    //
    void inorder() {
        inorder_Recursive(rootNode);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.data + " ");
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
        if (key == null || key == "") {
            return 0;
        } else {
            int depth = 0;
            return depth;
        }
    }

    /*
     * Method 3 - changes counters to 0
     */
    void reset() {
    }

    /*
     * Method 4 - creates string of trees content
     * Return - String (key depth)*/
    String printTree() {
        String treeContent = "";
        return treeContent;
    }
}
