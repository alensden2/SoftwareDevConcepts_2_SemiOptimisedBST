/**
 * STUDENT DETAILS
 *
 *  Name - Alen Santosh John
 * Email - al283652@dal.ca
 * Banner ID - B00930528
 * Assignment 2 - Binary Search Trees
*/

/**
 *  DynamicArray.java - Class file for a dynamic array of strings
*/

/**
 * CLASS DESCRIPTION
 *
 * This class uses an array of string of finite strings, that stores the key of
 * each entered node.
 * If the size of the array is full a new array with twice the size of the first
 * one is created. This array can be used to keep track of all the keys in the
 * binary trees
 */

/**
 * CONSTRUCTORS AND METHODS
 * 
 * 1. Constructor - initializes the size of the array
 * 2. addElement(String element) - @param - String;
 * 3. sizeOfArray() - @return - (int) Size of array
 * 4. getIndexOfElement(String element) - @param - String @return - String
 */
public class DynamicArray {
    String dynamicArray[];
    int countOfElements = 0;

    DynamicArray(int size) {
        dynamicArray = new String[size];
    }

    void addElement(String element) {
        if (dynamicArray.length == countOfElements) {
            String doubleSizeArray[] = new String[2 * countOfElements]; // declaring a array of double the original size
            for (int i = 0; i < countOfElements; i++) { // copying all elements to new array
                doubleSizeArray[i] = dynamicArray[i];
            }
            dynamicArray = doubleSizeArray;
        }
        dynamicArray[countOfElements++] = element;
    }

    int sizeOfArray() {
        return dynamicArray.length;
    }

    int getIndexOfElement(String element) {
        if (dynamicArray.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < dynamicArray.length; i++) {
                if (dynamicArray[i] == element) {
                    return i;
                }
            }
        }
        return -2;
    }

    String treeAsAString(){
        String treeStateString = "";
        for(int i = 0; i<dynamicArray.length; i++){
            if(dynamicArray[i] != null){
                treeStateString = treeStateString + dynamicArray[i];
            } else {
                break;
            }
        }
        return treeStateString;
    }

    void resetArray(){
        for(int i = 0; i<dynamicArray.length; i++){
            if(dynamicArray[i] != null){
                 dynamicArray[i] = null;
            } else {
                break;
            }
        }
    }
}
