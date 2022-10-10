public class DynamicArray {
    String dynamicArray[];
    int countOfElements = 0;

    DynamicArray(int size) {
        dynamicArray = new String[size];
    }

    // count for the no of elements

    void addElement(String element) {
        if (dynamicArray.length == countOfElements) {
            // declaring a array of double the original size
            String doubleSizeArray[] = new String[2 * countOfElements];
            // copying all elements to new array
            for (int i = 0; i < countOfElements; i++) {
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
        if(dynamicArray.length == 0){
            return -1;
        }
        else {
            for (int i = 0; i < dynamicArray.length; i++) {
                if (dynamicArray[i] == element) {
                    return i;
                }
            }
        }
        return -2;
    }
}
