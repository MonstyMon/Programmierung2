public class Main {
    public static void main(String[] args) {

        BinNode k1 = new BinNode(1);
        BinNode b1 = new BinNode(4);
        BinNode k2 = new BinNode(5);
        k2.setLeft(b1);
        BinNode m1 = new BinNode(3,k1,k2);
        BinNode h2 = new BinNode(11);
        BinNode p1 = new BinNode(8);
        BinNode j1 = new BinNode(7);
        j1.setRight(p1);
        BinNode m2 = new BinNode(9,j1,h2);
        BinNode m = new BinNode(6,m1,m2);
        BinNode a1 = new BinNode(14);
        BinNode a2 = new BinNode(35);
        BinNode n = new BinNode(22, a1, a2);
        BinNode o = new BinNode(13,m,n);
        BinTree baum = new BinTree();
        baum.setRoot(o);

        baum.depthFirst();
        // System.out.println(baum.isSorted());
        System.out.println(baum.removeNode(6));
        baum.depthFirst();


        /* BinTree tree1 = new BinTree(6);

        BinNode tree1node4 = new BinNode(4);
        BinNode tree1node9 = new BinNode(9);

        BinNode tree1node2 = new BinNode(2);
        BinNode tree1node7 = new BinNode(7);

        tree1.getRoot().setLeft(tree1node4);
        tree1.getRoot().setRight(tree1node9);
        tree1node4.setLeft(tree1node2);
        tree1node4.setRight(tree1node7);

        System.out.println(tree1.isSorted());
        System.out.println(tree1.calculateMaxSum());
        tree1.depthFirst();


        System.out.println();
        System.out.println();



        BinTree tree2 = new BinTree(7);
        BinNode tree2node4 = new BinNode(4);
        BinNode tree2node9 = new BinNode(9);
        BinNode tree2node8 = new BinNode(8);
        BinNode tree2node5 = new BinNode(5);
        BinNode tree2node2 = new BinNode(2);
        BinNode tree2node1 = new BinNode(1);
        BinNode tree2node3 = new BinNode(3);

        tree2.getRoot().setLeft(tree2node4);
        tree2.getRoot().setRight(tree2node9);
        tree2node9.setLeft(tree2node8);
        tree2node4.setRight(tree2node5);
        tree2node4.setLeft(tree2node2);
        tree2node2.setLeft(tree2node1);
        tree2node2.setRight(tree2node3);

        System.out.println(tree2.isSorted());
        System.out.println(tree2.calculateMaxSum());
        tree2.depthFirst();
        System.out.println(tree2.removeNode(7));
        System.out.println();
        tree2.depthFirst();
        */















/*

        public boolean removeNode(int away) throws NullPointerException {
            if (root == null){throw new NullPointerException();
            } else {
                root = removeNodeUtil(root, away);
                return true;

            }
        }

        private BinNode removeNodeUtil(BinNode root, int value) {
            if (root == null) {
                return null;
            }


            // 3rd case: equals
            if (value < root.data) {
                root.left = removeNodeUtil(root.left, value);
            } else if (value > root.data) {
                root.right = removeNodeUtil(root.right, value);
            } else {

                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                root.data = minValue(root.right);
                root.right = removeNodeUtil(root.right, root.data);
            }
            return root;
        }*/
    }
}