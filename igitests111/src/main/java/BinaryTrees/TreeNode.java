package BinaryTrees;

public class TreeNode {
    int key;
    String name;
    TreeNode leftChild;
    TreeNode rightChild;


    public TreeNode(int key, String name) {
        this.key = key;
        this.name = name;
    }


    public String toString(){
        return name + " has a key" + key;
    }
}
