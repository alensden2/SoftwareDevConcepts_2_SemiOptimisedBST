public class RotateTree {
    void isRotateRequired(Node rotateNode, Node rotateNodeParent, Node rotateNodeChild) {
        if (rotateNodeChild.searchFrequency > rotateNode.searchFrequency) {
            if (rotateNode.left == rotateNodeChild) {
                // right rotation
                rightRotate(rotateNode);
                System.out.println("right rotate");
            } else if (rotateNode.right == rotateNodeChild) {
                // left rotation
                System.out.println("left rotation");
            }
        } else {
            // no rotation required
            System.out.println("no rotation");
        }
    }

    Node leftRotate(Node parentNode, Node currentNode, Node leftNode) {

        return currentNode;
    }

    Node rightRotate(Node rotateNode) {
        Node parentOfRotateNode = rotateNode.parent;
        Node childOfRotateNode = rotateNode.left;
        rotateNode.left = childOfRotateNode.right;

        if(childOfRotateNode.right != null){
            childOfRotateNode.right.parent = rotateNode;
        }

        childOfRotateNode.right = rotateNode;
        rotateNode.parent = childOfRotateNode;
        childOfRotateNode.parent = parentOfRotateNode;

        if (parentOfRotateNode != null){
            if(parentOfRotateNode.left == rotateNode){
                parentOfRotateNode.left = childOfRotateNode;
            } else {
                parentOfRotateNode.right = childOfRotateNode;
            }
        }

        return childOfRotateNode;
    }


}
