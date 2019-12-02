package mem.kbrleson.assignment9;
// this version of BST has all the three recursive traversal methods

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


public class Assign9_3SD {
    public static void main(String[] args) {
        Integer[] ar = {12, 43, 34, 12, 67, 23, 99, 23, 999, 23, 45, 67, 78, 123, 234, 456, 454, 23};
        String[] sr = {"Kara", "Liam", "Jordon", "Amy", "Jon", "Sahil", "Jordon", "Amy", "Up", "down", "left", "right", "ringo", "paul", "Matthew", "Jon", "amy", "Chloe", "Tyler"};

        BST<Integer> itree = new BST<>(ar);
        BST<String> stree = new BST<>(sr);

		System.out.print("itree: ");
		itree.mini();

        System.out.print("itree: ");
		itree.maxi();

        System.out.print("stree: ");
		stree.mini();

        System.out.print("stree: ");
		stree.maxi();
//
        // using recursive build-on traveral
        System.out.println("\n +++++++ using recursive build-in traversal method ");
        System.out.println(" inorder: ");
        itree.inorder();
        System.out.println("\n using non-recursive traversal method");
        // add codes here display results for pre and post order...

        System.out.println(" inorder: ");
        itree.nonRecursiveInorder();
        stree.nonRecursiveInorder();
        System.out.println("\n pre-order: ");
        itree.nonRecursivePreorder();
        stree.nonRecursivePreorder();
        System.out.println("\n post-order: ");
        itree.nonRecursivePostorder();
        stree.nonRecursivePostorder();

    }

    /************* BST Class ***********************/

    public static class BST<E extends Comparable<E>> {
        protected TreeNode<E> root;
        protected int size = 0;

        /**
         * Create a default binary search tree
         */
        public BST() {
        }

        /**
         * Create a binary search tree from an array of objects
         */
        public BST(E[] objects) {
            for (int i = 0; i < objects.length; i++)
                insert(objects[i]);
        }

        /************** Return true if the element is in the tree */
        public boolean search(E e) {
            TreeNode<E> current = root; // Start from the root

            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    current = current.right;
                } else
                    // element matches current.element
                    return true; // Element is found
            }
            return false;
        }

        /****** * Insert element e into the binary search tree Return true if the element is inserted successfully */

        public boolean insert(E e) {
            if (root == null) root = createNewNode(e); // Create a new root
            else {
                // Locate the parent node
                TreeNode<E> parent = null;
                TreeNode<E> current = root;
                while (current != null) {
                    if (e.compareTo(current.element) < 0) {
                        parent = current;
                        current = current.left;
                    } else if (e.compareTo(current.element) > 0) {
                        parent = current;
                        current = current.right;
                    } else
                        return false; // Duplicate node not inserted
                }
                // Create the new node and attach it to the parent node
                if (e.compareTo(parent.element) < 0)
                    parent.left = createNewNode(e);
                else
                    parent.right = createNewNode(e);
            }
            size++;
            return true; // Element inserted
        }

        /****** createNewNode(E e)  return TreeNode <E>  **/
        protected TreeNode<E> createNewNode(E e) {
            return new TreeNode<E>(e);
        }

        /***** Inorder traversal from the root */
        public void inorder() {
            inorder(root);
        }

        /**** Inorder traversal from a subtree */
        protected void inorder(TreeNode<E> root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.print(root.element + " ");
            inorder(root.right);
        }

        /**** Postorder traversal from the root */
        public void postorder() {
            postorder(root);
        }

        /**
         * Postorder traversal from a subtree
         */
        protected void postorder(TreeNode<E> root) {
            if (root == null)
                return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.element + " ");
        }

        /**
         * Preorder traversal from the root
         */
        public void preorder() {
            preorder(root);
        }

        /**
         * Preorder traversal from a subtree
         */
        protected void preorder(TreeNode<E> root) {
            if (root == null)
                return;
            System.out.print(root.element + " ");
            preorder(root.left);
            preorder(root.right);
        }

        /**
         * Inner class static tree node
         */
        public static class TreeNode<E extends Comparable<E>> {
            E element;
            TreeNode<E> left;
            TreeNode<E> right;

            public TreeNode(E e) {
                element = e;
            }
        }

        /**
         * Get the number of nodes in the tree
         */
        public int getSize() {
            return size;
        }

        /**
         * Returns the root of the tree
         */
        public TreeNode<E> getRoot() {
            return root;
        }

        /**
         * Returns a path from the root leading to the specified element
         */
        public ArrayList<TreeNode<E>> path(E e) {

            ArrayList<TreeNode<E>> list = new ArrayList<TreeNode<E>>();
            TreeNode<E> current = root; // Start from the root

            while (current != null) {
                list.add(current); // Add the node to the list
                if (e.compareTo(current.element) < 0) {
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    current = current.right;
                } else
                    break;
            }
            return list; // Return an array of nodes
        }

        /**
         * Delete an element from the binary search tree. Return true if the element is
         * deleted successfully Return false if the element is not in the tree
         */
        public boolean delete(E e) {
            // Locate the node to be deleted and also locate its parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    break; // Element is in the tree pointed by current
            }

            if (current == null)
                return false; // Element is not in the tree

            // Case 1: current has no left children
            if (current.left == null) {
                // Connect the parent with the right child of the current node
                if (parent == null) {
                    root = current.right;
                } else {
                    if (e.compareTo(parent.element) < 0)
                        parent.left = current.right;
                    else
                        parent.right = current.right;
                }
            } else {
                // Case 2: The current node has a left child
                // Locate the rightmost node in the left subtree of
                // the current node and also its parent
                TreeNode<E> parentOfRightMost = current;
                TreeNode<E> rightMost = current.left;

                while (rightMost.right != null) {
                    parentOfRightMost = rightMost;
                    rightMost = rightMost.right; // Keep going to the right
                }

                // Replace the element in current by the element in rightMost
                current.element = rightMost.element;

                // Eliminate rightmost node
                if (parentOfRightMost.right == rightMost)
                    parentOfRightMost.right = rightMost.left;
                else
                    // Special case: parentOfRightMost == current
                    parentOfRightMost.left = rightMost.left;
            }

            size--;
            return true; // Element deleted
        }

        /**
         * Obtain an iterator. Use inorder.
         */
        public Iterator<E> iterator() {
            return new InorderIterator();
        }

        // Inner class InorderIterator
        private class InorderIterator implements Iterator<E> {
            // Store the elements in a list
            private ArrayList<E> list = new ArrayList<E>();
            private int current = 0; // Point to the current element in list

            public InorderIterator() {
                inorder(); // Traverse binary tree and store elements in list
            }

            /**
             * Inorder traversal from the root
             */
            private void inorder() {
                inorder(root);
            }

            /**
             * Inorder traversal from a subtree
             */
            private void inorder(TreeNode<E> root) {
                if (root == null)
                    return;
                inorder(root.left);
                list.add(root.element);
                inorder(root.right);
            }

            /**
             * Next element for traversing?
             */
            public boolean hasNext() {
                if (current < list.size())
                    return true;
                return false;
            }

            /**
             * Get the current element and move cursor to the next
             */
            public E next() {
                return list.get(current++);
            }

            /**
             * Remove the current element and refresh the list
             */
            public void remove() {
                delete(list.get(current)); // Delete the current element
                list.clear(); // Clear the list
                inorder(); // Rebuild the list
            }
        }

        /**
         * Remove all elements from the tree
         */
        public void clear() {
            root = null;
            size = 0;
        }

        public void maxi() {
            System.out.println("Largest is: " + this.findMaximum());
        }

        public E findMaximum() {
            TreeNode<E> current = this.root;
            while (current.right != null) {
                current = current.right;
            }

            return current.element;
        }

        public void mini() {
            System.out.println("Smallest is: " + this.findMinimum());
        }

        public E findMinimum() {
            TreeNode<E> current = this.root;
            while (current.left != null) {
                current = current.left;
            }

            return current.element;
        }


        /**
         * Inorder traversal from the root
         */
        public void nonRecursiveInorder() {
            ArrayList<TreeNode<E>> list = new ArrayList<>();
            Stack<TreeNode<E>> stack = new Stack<>();

            if (root == null)
                return;

            stack.push(root);

            while (!stack.isEmpty()) {
                // use node to move up/down the tree.
                TreeNode<E> node = (TreeNode<E>) (stack.peek());
                // advance to left child until null and push( ) each node along the way
                if (node.left != null && !list.contains(node.left)) {
                    stack.push(node.left); // Add the left node to the stack

                } else { // call to next node (pop() ) set to node.right
                    stack.pop(); // Remove the node from the stack
                    list.add(node);
                    if (node.right != null) {
                        stack.push(node.right); // Add the right node to the stack
                    }
                }
            }
            for (int i = 0; i < list.size(); i++)
                System.out.print(((TreeNode<E>) (list.get(i))).element + " ");
            System.out.println();
        }

        /**
         * Inorder traversal from the root
         */
        public void nonRecursivePreorder() {
            // add codes here .......................
            System.out.println(" Build me a pre-order non-recursively");


        }

        /**
         * Inorder traversal from the root
         */
        public void nonRecursivePostorder() {

            System.out.println(" Build me a post-order non-recursively");


        }

    }
}
