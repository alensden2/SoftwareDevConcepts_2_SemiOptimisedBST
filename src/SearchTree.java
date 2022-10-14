public class SearchTree {
    // instance of node class
    Node rootNode;
    // initialised size to 100
    DynamicArray arrayOfNodes = new DynamicArray(100);
    TreeMethods treeMethods = new TreeMethods();
    Node root = rootNode;

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
            if (arrayOfNodes.getIndexOfElement(key) == -2) {
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
            rootNode = treeMethods.treeDepth(rootNode, key, 1, oldRoot);
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
