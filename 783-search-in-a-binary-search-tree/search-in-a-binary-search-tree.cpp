/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* searchBST(TreeNode* root, int l) {
        if(root==nullptr) return nullptr;
        if(root->val==l){
            return root;
        }
        if(root->val>l){
            return searchBST(root->left,l);
        }
        if(root->val<l){
            return searchBST(root->right,l);
        }
        return nullptr;
    }
};