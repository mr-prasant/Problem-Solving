class Solution {

    public boolean finder(Queue<TreeNode> nodes, boolean isEven) {
        if (nodes.isEmpty()) return true;

        Queue<TreeNode> childs = new LinkedList<>();

        int rem = (isEven)? 1 : 0;
        int cmp = (isEven)? Integer.MIN_VALUE : Integer.MAX_VALUE;

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            if (node.left != null) childs.add(node.left);
            if (node.right != null) childs.add(node.right);

            if (node.val%2 != rem 
                || (isEven && cmp >= node.val)
                || (!isEven && cmp <= node.val)) return false;
            cmp = node.val;
        }

        return finder(childs, !isEven);
    }

    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);

        return finder(nodes, true);
    }
}