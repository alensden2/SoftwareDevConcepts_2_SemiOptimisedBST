/**
 * Software Development Concepts
 * 
 * @author Alen Santosh John
 * @author B00930528
 * 
 *         This class uses an array of string of finite length, that stores the
 *         key of each entered node. If the size of the array is full a new
 *         array
 *         with twice the size of the first one is created. This array can be
 *         used
 *         to keep track of all the keys in the binary trees
 *         References -
 * @link - https://www.geeksforgeeks.org/creating-a-dynamic-array-in-java/
 */

public class DynamicArray {
    String dynamicArray[];
    int countOfElements = 0;

    /**
     * Constructor takes in the size of the array the array is initialised
     * with this value.
     * 
     * @param size defined size of array
     */
    DynamicArray(int size) {
        dynamicArray = new String[size];
    }

    /**
     * This method takes in a string. This string is added to the array.
     * This method also checks if the total no of elements has exceeded
     * the size of the array, in the case of which a new array with twice
     * the size is created.
     * 
     * @param element the key of the node
     */
    void addElement(String element) {
        if (dynamicArray.length == countOfElements) {
            String doubleSizeArray[] = new String[2 * countOfElements];
            for (int i = 0; i < countOfElements; i++) {
                doubleSizeArray[i] = dynamicArray[i];
            }
            dynamicArray = doubleSizeArray;
        }
        dynamicArray[countOfElements++] = element;
    }

    /**
     * Returns the total size of the array. NOTE - the total size of the
     * array may be different from the total no of elements present.
     * 
     * @return length of the array
     */
    int sizeOfArray() {
        return dynamicArray.length; // returns the size of the array
    }

    /**
     * Returns the index of the element that is passed. In the case of the
     * element not present returns -2
     * 
     * @param element the key of the node
     * @return
     */
    int getIndexOfElement(String element) {
        if (dynamicArray.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < dynamicArray.length; i++) {
                if (dynamicArray[i] != null) {
                    if (dynamicArray[i].compareToIgnoreCase(element) == 0) {
                        return i;
                    }
                }

            }
        }
        return -2;
    }

}
