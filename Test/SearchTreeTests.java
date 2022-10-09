import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SearchTreeTests {
    @Test
    public void testAddInput() {
        boolean returnAns = true;
        boolean returnVal;
        boolean returnVal2;
        String paramsAdd = "test";
        SearchTree searchTree = new SearchTree();
        returnVal = searchTree.add(paramsAdd);
        returnVal2 = searchTree.add(null);
        assertEquals(returnAns, returnVal);
        assertEquals(false, returnVal2);
    }
}
