public class Main {
    public static void main(String[] args) {
        SearchTree searchTree = new SearchTree();
        searchTree.add("car");
        searchTree.add("bike");
        searchTree.add("aeroplane");
        searchTree.add("myria");
        searchTree.add("dog");
        searchTree.add("3233");

        searchTree.inorder();
    }
}