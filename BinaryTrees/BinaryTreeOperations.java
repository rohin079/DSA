package BinaryTrees;

public class BinaryTreeOperations {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    static class BinaryTree {
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public static void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        public static void postorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Preorder traversal of the tree:");
        tree.preorderTraversal(root);

        System.out.println("Inorder traversal of the tree:");
        tree.inorderTraversal(root);

        System.out.println("Postorder traversal of the tree:");
        tree.postorderTraversal(root);
    }
}
