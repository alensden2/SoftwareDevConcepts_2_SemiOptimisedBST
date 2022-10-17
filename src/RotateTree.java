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

public class RotateTree {

    /**
     * This method checks for the tyoe of rotation required. if the node required to
     * be rotated is in the left of the parent node
     * and the search frequency of the child is greater than the parent then a right
     * rotation is performed and vice versa
     * 
     * @param rotateNode
     * @param rotateNodeChild
     * @param oldRoot
     * @return
     */
    Node isRotateRequired(Node rotateNode, Node rotateNodeChild, Node oldRoot) {
        if (rotateNodeChild.searchFrequency > rotateNode.searchFrequency) {
            if (rotateNode.left == rotateNodeChild) {
                // right rotation
                Node rootChanged = rightRotate(rotateNode, oldRoot);
                return rootChanged;
            } else if (rotateNode.right == rotateNodeChild) {
                // left rotation
                Node rootChanged = leftRotate(rotateNode, oldRoot);
                return rootChanged;
            }
        } else {
            // no rotation required
            ;
        }
        return oldRoot;
    }

    /**
     * This method returns the left rotated tree
     * 
     * @param rotateNode
     * @param oldRoot
     * @return
     */
    Node leftRotate(Node rotateNode, Node oldRoot) {
        Node parentOfRotateNode = rotateNode.parent; // setting pointer for the parent of the rotate node
        Node childOfRotateNode = rotateNode.right; // pointer for the child of the rotate node
        rotateNode.right = childOfRotateNode.left;

        if (childOfRotateNode.left != null) {
            childOfRotateNode.left.parent = rotateNode; // setting the sub tree of the child with rootNode
        }

        childOfRotateNode.left = rotateNode; // setting the left reference to the rotate node
        rotateNode.parent = childOfRotateNode; // setting the new node as the parent for the rotation node
        childOfRotateNode.parent = parentOfRotateNode;

        if (parentOfRotateNode != null) { // setting the parent of the old node to the new node
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

    /**
     * This method returns the right rotated tree
     * 
     * @param rotateNode
     * @param oldRoot
     * @return
     */
    Node rightRotate(Node rotateNode, Node oldRoot) {
        Node parentOfRotateNode = rotateNode.parent;
        Node childOfRotateNode = rotateNode.left;
        rotateNode.left = childOfRotateNode.right;

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
