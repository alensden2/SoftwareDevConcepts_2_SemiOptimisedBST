public class Main {
    public static void main(String[] args) {
        SearchTree searchTree = new SearchTree();
        searchTree.add("egg");
        searchTree.add("carrot");
        searchTree.add("lentil");
        searchTree.add("apple");
        searchTree.add("date");
        searchTree.add("fig");
        searchTree.add("yam");
        searchTree.find("apple");


        searchTree.inorder();
    }
}