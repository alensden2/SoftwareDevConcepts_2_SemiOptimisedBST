public class Main {
    public static void main(String[] args) {

        /*
         * SearchTree searchTree = new SearchTree();
         * searchTree.add("egg");
         * searchTree.add("carrot");
         * searchTree.add("lentil");
         * searchTree.add("apple");
         * searchTree.add("date");
         * searchTree.add("fig");
         * searchTree.add("yam");
         * int a = searchTree.find("apple");
         * int b = searchTree.find("apple");
         * int c = searchTree.find("apple");
         * int d = searchTree.find("fig");
         * int e = searchTree.find("fig");
         * int f = searchTree.find("fig");
         * int g = searchTree.find("fig");
         * int i = searchTree.find("yam");
         * int j = searchTree.find("apple");
         * searchTree.find("egg");
         * searchTree.find("carrot");
         * searchTree.find("carrot");
         * searchTree.find("carrot");
         * searchTree.find("apple");
         * searchTree.find("apple");
         * searchTree.find("apple");
         * searchTree.find("apple");
         * searchTree.find("fig");
         * searchTree.find("yam");
         * searchTree.find("egg");
         * searchTree.find("egg");
         * searchTree.find("apple");
         * searchTree.find("carrot");
         * searchTree.find("apple");
         * searchTree.find("apple");
         * searchTree.find("date");
         * searchTree.find("date");
         * System.out.println(searchTree.printTree());
         */
        SearchTree s1 = new SearchTree();
        s1.add("MUdra");
        s1.add("Milind");
        s1.add("kaushal");
        s1.add("muskan");
        s1.add("ashwati");
        s1.add("shardul");
        s1.add("gaurav");
        s1.add("pallavi");
        s1.add("alen");
        s1.add("limysh");
        s1.add("dhruv");
        s1.add("rishi");
        s1.add("Anirudh");

        int d = s1.find("rishi");
        System.out.println(d);

        int r = s1.find("rishi");
        System.out.println(r);

        int p = s1.find("rishi");
        System.out.println(p);

        int q = s1.find("rishi");
        System.out.println(q);

        String s4 = s1.printTree();
        System.out.println(s4);

        int s = s1.find("anirudh");
        System.out.println(s);

        int b = s1.find("gaurav");
        System.out.println(b);

        int c = s1.find("limysh");
        System.out.println(c);

        String s7 = s1.printTree();
        System.out.println(s7);

        int t = s1.find("shardul");
        System.out.println(t);

        String s9 = s1.printTree();
        System.out.println(s9);

    }
}