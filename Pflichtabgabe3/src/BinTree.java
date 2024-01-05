/**
 * The BinTree class implements the BinTreeInterface and represents a binary tree data structure.
 */
public class BinTree implements BinTreeInterface {
    private BinNode root;

    /**
     * Constructs an instance of BinTree with the root set to null.
     */
    public BinTree() {
        this.root = null;
    }

    /**
     * Returns the root node of the binary tree.
     * @return the root node of the binary tree, or null if the tree is empty
     */
    public BinNode getRoot() {return root;}

    /**
     * Sets the root node of the binary tree.
     * @param root the new root node of the binary tree
     */
    public void setRoot(BinNode root) {this.root = root;}

    /**
     * Calculates the maximum sum of the elements in the binary tree.
     * @return the maximum sum of the elements in the binary tree
     */
    @Override
    public int calculateMaxSum() {
        return calculateMaxSum(root);
    }

    /**
     * Recursively calculates the maximum sum of the elements in the binary tree starting from the given node.
     * @param node the current node in the binary tree
     * @return the maximum sum of the elements in the binary tree starting from the given node
     */
    private int calculateMaxSum(BinNode node) {
        if (node == null) {
            return 0;
        }
        int leftSum = calculateMaxSum(node.getLeft());
        int rightSum = calculateMaxSum(node.getRight());

        return node.getData() + Math.max(leftSum, rightSum);
    }

    /**
     * Checks if the binary tree is sorted.
     * @return true if the binary tree is sorted, false otherwise
     */
    @Override
    public boolean isSorted() {
        return isSorted(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Recursively checks if the binary tree rooted at the given node is sorted within the specified range.
     * @param node the current node in the binary tree
     * @param min the minimum value that a node in the tree must have
     * @param max the maximum value that a node in the tree must have
     * @return true if the binary tree rooted at the given node is sorted within the specified range, false otherwise
     */
    private boolean isSorted(BinNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data < min || node.data > max) {
            return false;
        }
        return (isSorted(node.left, min, node.data - 1) && isSorted(node.right, node.data + 1, max));
    }

    /**
     * Performs a depth-first traversal of the binary tree, starting from the root.
     * The traversal visits the current node, its right child, and lastly its left child.
     * This method uses a stack to keep track of the nodes to be visited, and it prints the data of each visited node.
     */
    @Override
    public void depthFirst() {
        if (root == null) {
            return;
        }

        StackGeneric<BinNode> stack = new StackGeneric<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            BinNode node = stack.pop();
            System.out.print(node.data + " ");

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    /**
     * Removes the node with the specified value from the binary tree.
     * @param away given value to remove
     * @return true if the value is successfully removed, false if the value doesn't exist in the tree
     * @throws IllegalStateException if the tree is empty
     */
    @Override
    public boolean removeNode(int away) throws IllegalStateException {
        if (root == null)throw new IllegalStateException();
        return removeNode(away, root);
    }

    /**
     * Removes the node with the specified value from the binary tree rooted at the given node.
     * @param away the value to be removed from the tree
     * @param root root of the binary tree
     * @return true if the value is successfully removed, false if the value doesn't exist in the tree
     */
    private boolean removeNode(int away, BinNode root){
        if (root == null) return false;
        if (root.data == away) return removeNodeUtil(root);
        if (root.data > away) return removeNode(away, root.left);
        return removeNode(away, root.right);
    }

    /**
     * Removes the given node from the binary tree.
     * @param node the node to be removed from the tree
     * @return true if the node is successfully removed, false otherwise
     * @throws IllegalStateException if the tree is not sorted
     */
    private boolean removeNodeUtil(BinNode node) throws IllegalStateException{
        if (!isSorted()) throw new IllegalStateException();

        if(node == null) return false;
        // call method removeRoot if root = node
        if(node == root) return removeRoot();
        // otherwise find parent of node
        BinNode parent = findParent(node, root);

        // no children
        if (node.left == null && node.right == null) {
            if(parent.left == node) parent.left = null;
            else parent.right = null;
        }

        // one child (left side)
        else if (node.left == null) {
            if(parent.left == node) parent.left = node.right;
            else parent.right = node.right;
        }
        // one child (right side)
        else if (node.right == null) {
            if(parent.left == node) parent.left = node.left;
            else parent.right = node.left;
        }
        // two children
        else{
            // find the smallest node in the side of right child
            BinNode tempMin = minNode(node.right);
            // remove that node
            removeNode(tempMin.data);

            // node on the left side of parent
            if (parent.left == node) {
                parent.left = tempMin;
                parent.left.left = node.left;
                parent.left.right = node.right;
            // node on the right side of parent
            }else {
                parent.right = tempMin;
                parent.right.left = node.left;
                parent.right.right = node.right;
            }
        }
        return true;
    }

    /**
     * Removes the root node of the binary tree.
     * If the root has no children, it is set to null.
     * If the root has one child, the root is replaced by its child.
     * If the root has two children, it is replaced by its inorder successor.
     * @return true if the root node is successfully removed, false otherwise
     */
    private boolean removeRoot() {
        // No children
        if(root.left == null && root.right == null) root = null;
        // One Child (Left & Right)
        else if(root.left == null) root = root.right;
        else if(root.right == null) root = root.left;
        // Two Children
        else {
            // find the smallest node in the side of right child
            BinNode tempMinNode = minNode(root.right);
            // remove node from tree
            removeNode(tempMinNode.data);
            BinNode tempNode = root;
            root = tempMinNode;
            root.left = tempNode.left;
            root.right = tempNode.right;
        }
        return true;
    }

    /**
     * Recursively finds the parent of the given node in the binary tree rooted at the specified root node.
     * @param node the node for which the parent is to be found
     * @param root the root of the binary tree
     * @return the parent of the given node, or null if the node is not found or it is the root node
     */
    private BinNode findParent(BinNode node, BinNode root) {
        if (root == null || root == node) {
            return null; // Node not found or it is the root node
        }
        if (root.left == node || root.right == node) {
            return root; // Node is the left or right child of the current root
        }
        // Recursively search in the left and right subtrees
        BinNode left = findParent(node, root.left);
        // node found in left subtree
        if (left != null) {
            return left;
        }
        // node found in right subtree
        return findParent(node, root.right);
    }

    /**
     * Finds and returns the node with the minimum value in the binary search tree rooted at the given node.
     * @param root the root of the binary search tree
     * @return the node with the minimum value in the binary search tree
     */
    private BinNode minNode(BinNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}