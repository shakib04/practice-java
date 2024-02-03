package ds.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int data;
    public List<TreeNode> children;

    public TreeNode(int data, int[] dataOfChildren) {
        this.data = data;
        this.children = getListOfNodes(dataOfChildren);
    }

    private List<TreeNode> getListOfNodes(int[] data) {
        if (data == null) return null;
        List<TreeNode> listOfNodes = new ArrayList<>();
        for (int datum : data) {
            TreeNode treeNode = new TreeNode(datum, null);
            listOfNodes.add(treeNode);
        }
        return listOfNodes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TreeNode{");
        sb.append("data=").append(data);
        sb.append(", children=").append(children);
        sb.append('}');
        return sb.toString();
    }
}
