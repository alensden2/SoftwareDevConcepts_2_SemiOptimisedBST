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
            for(int i = 0; i< countOfElements; i++){
                doubleSizeArray[i] = dynamicArray[i];
            }
            dynamicArray = doubleSizeArray;
        }
        dynamicArray[countOfElements++] = element;
    }
}
