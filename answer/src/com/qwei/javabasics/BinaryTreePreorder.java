package com.qwei.javabasics;

;
import com.qwei.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * The visit order: Root, left subtree, right subtree
 */
public class BinaryTreePreorder {
  public static List<TreeNode> preorderTraverse(TreeNode root) {
    if (root == null) {
      return new ArrayList<TreeNode>();
    }

    List<TreeNode> list = new ArrayList<TreeNode>();
    helper(list, root);
    return list;
  }

  public static void helper(List<TreeNode> list, TreeNode root) {
    if (root == null) {
      return;
    }
    list.add(root);
    helper(list, root.left);
    helper(list, root.right);
  }
}
