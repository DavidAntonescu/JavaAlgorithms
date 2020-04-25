package DataStructures.Heaps;


/* Interface common to heap data structures.<br>*/
public interface Heap {

    HeapElement getElement() throws EmptyHeapException;

    /*Inserts an element in the heap. Adds it to then end and toggle it until it finds its right position.*/
    void insertElement(HeapElement element);

    /*Delete an element in the heap.*/
    void deleteElement(int elementIndex);

}
