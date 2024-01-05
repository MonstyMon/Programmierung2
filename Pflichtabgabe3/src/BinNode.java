/**
 * The BinNode class represents a node in a binary tree data structure.
 */
public class BinNode{
    int data;
    BinNode left, right;

    /**
     * Constructs a BinNode with the specified data, and sets the left and right references to null.
     * @param d the data to be stored in the BinNode
     */
    BinNode(int d){
        data = d;
        left = right = null;
    }

    /**
     * Constructs a BinNode with the specified data, left child, and right child.
     * @param d the data to be stored in the BinNode
     * @param l the left child of the BinNode
     * @param r the right child of the BinNode
     */
    BinNode(int d, BinNode l, BinNode r){
        data = d; left = l; right = r;
    }

    /**
     * Gets the value of the data stored in the BinNode.
     * @return the value of data
     */
    public int getData(){return data;}

    /**
     * Sets the value of the data in the BinNode.
     * @param data the new value to be set
     */
    public void setData(int data) {this.data = data;}

    /**
     * Gets the left child of the current node.
     * @return the left child of the current node
     */
    public BinNode getLeft() {return left;}

    /**
     * Sets the left child of the current node.
     * @param left the new left child of the current node
     */
    public void setLeft(BinNode left) {this.left = left;}

    /**
     * Gets the right child of the current node.
     * @return the right child of the current node
     */
    public BinNode getRight() {return right;}

    /**
     * Sets the right child of the current node.
     * @param right the new right child of the current node
     */
    public void setRight(BinNode right) {this.right = right;}
}