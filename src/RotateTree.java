public class RotateTree {
    Node isRotateRequired(Node rotateNode, Node rotateNodeParent, Node rotateNodeChild, Node oldRoot) {
        if (rotateNodeChild.searchFrequency > rotateNode.searchFrequency) {
            if (rotateNode.left == rotateNodeChild) {
                // right rotation
                Node rootChanged = rightRotate(rotateNode, oldRoot);
                System.out.println("right rotate");
                return rootChanged;
            } else if (rotateNode.right == rotateNodeChild) {
                // left rotation
                Node rootChanged = leftRotate(rotateNode, oldRoot);
                System.out.println("left rotation");
                return rootChanged;
            }
        } else {
            // no rotation required
            System.out.println("no rotation");
        }
        return oldRoot;
    }

    Node leftRotate(Node rotateNode, Node oldRoot) {
        Node parentOfRotateNode = rotateNode.parent; // null rota=egg
        Node childOfRotateNode = rotateNode.right; // carrot
        rotateNode.right = childOfRotateNode.left; // right is date

        if (childOfRotateNode.left != null) {
            childOfRotateNode.left.parent = rotateNode;
        }

        childOfRotateNode.left = rotateNode;
        rotateNode.parent = childOfRotateNode;
        childOfRotateNode.parent = parentOfRotateNode;

        if (parentOfRotateNode != null) {
            if (parentOfRotateNode.left == rotateNode) {
                parentOfRotateNode.left = childOfRotateNode;
            } else {
                parentOfRotateNode.right = childOfRotateNode;
            }
        }
        if (childOfRotateNode.parent == null) {
            oldRoot = childOfRotateNode;
        }
        return oldRoot;
    }

    Node rightRotate(Node rotateNode, Node oldRoot) {
        Node parentOfRotateNode = rotateNode.parent; // null rota=egg
        Node childOfRotateNode = rotateNode.left; // carrot
        rotateNode.left = childOfRotateNode.right; // right is date

        if (childOfRotateNode.right != null) {
            childOfRotateNode.right.parent = rotateNode;
        }

        childOfRotateNode.right = rotateNode;
        rotateNode.parent = childOfRotateNode;
        childOfRotateNode.parent = parentOfRotateNode;

        if (parentOfRotateNode != null) {
            if (parentOfRotateNode.left == rotateNode) {
                parentOfRotateNode.left = childOfRotateNode;
            } else {
                parentOfRotateNode.right = childOfRotateNode;
            }
        }
        if (childOfRotateNode.parent == null) {
            oldRoot = childOfRotateNode;
        }
        return oldRoot;
    }

}
