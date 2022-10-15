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
        searchTree.find("apple");

        searchTree.find("apple");
        searchTree.find("fig");
        searchTree.find("fig");
        searchTree.find("fig");
        searchTree.find("fig");
        searchTree.find("yam");
        searchTree.find("apple");

        // searchTree.find("egg");
        // searchTree.find("carrot");
        // searchTree.find("carrot");
        // searchTree.find("carrot");
        // searchTree.find("apple");
        // searchTree.find("apple");
        // searchTree.find("apple");
        // searchTree.find("apple");
        ////
        // searchTree.find("fig");
        // searchTree.find("yam");
        // searchTree.find("egg");
        // searchTree.find("egg");
        // searchTree.find("apple");

        // searchTree.find("carrot");
        // searchTree.find("apple");
        // searchTree.find("apple");
        // searchTree.find("date");
        // searchTree.find("date");
        // searchTree.inorder();

    }
}