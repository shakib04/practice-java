package ds.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Tree {
    public TreeNode root;

    Tree(TreeNode root) {
        this.root = root;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tree{");
        sb.append("root=").append(root);
        sb.append('}');
        return sb.toString();
    }
}

public class TreeExample {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new int[]{4,6,74,3});
        TreeNode firstChild = root.children.get(0);
        firstChild.children = Collections.singletonList(new TreeNode(999, null));
        Tree tree = new Tree(root);

        System.out.println(tree);
    }
}
