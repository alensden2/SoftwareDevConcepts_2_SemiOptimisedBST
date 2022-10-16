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

        int a = searchTree.find("apple");
        int b = searchTree.find("apple");
//
        int c = searchTree.find("apple");
        int d = searchTree.find("fig");
        int e = searchTree.find("fig");
        int f = searchTree.find("fig");
        int g = searchTree.find("fig");
        int i = searchTree.find("yam");
        int j = searchTree.find("apple");

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
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + i + " " + j);

    }
}