/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
void inorderTraversalHelper(struct TreeNode* root, int* result, int* index) {
    if (root == NULL) return;
    
    
    inorderTraversalHelper(root->left, result, index);
    
    
    result[(*index)++] = root->val;
    
    
    inorderTraversalHelper(root->right, result, index);
}
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    int* result = (int*)malloc(100 * sizeof(int)); 
    *returnSize = 0;
    inorderTraversalHelper(root, result, returnSize);
    return result;
    
}