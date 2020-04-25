package DataStructures.Heaps;

import java.lang.Double;
import java.lang.Object;


/*Class for heap elements*/
public class HeapElement {
    private final double key;
    private final Object additionalInfo;

    // Constructors

    public HeapElement(double key, Object info) {
        this.key = key;
        this.additionalInfo = info;
    }

    public HeapElement(int key, Object info) {
        this.key = key;
        this.additionalInfo = info;
    }


    public HeapElement(Integer key, Object info) {
        this.key = key;
        this.additionalInfo = info;
    }


    public HeapElement(Double key, Object info) {
        this.key = key;
        this.additionalInfo = info;
    }


    public HeapElement(double key) {
        this.key = key;
        this.additionalInfo = null;
    }


    public HeapElement(int key) {
        this.key = key;
        this.additionalInfo = null;
    }


    public HeapElement(Integer key) {
        this.key = key;
        this.additionalInfo = null;
    }


    public HeapElement(Double key) {
        this.key = key;
        this.additionalInfo = null;
    }

    // Getters

    public Object getInfo() {
        return additionalInfo;
    }

    public double getKey() {
        return key;
    }

    // Overridden object methods

    public String toString() {
        return "Key: " + key + " - " + additionalInfo.toString();
    }

    public boolean equals(HeapElement otherHeapElement) {
        return (this.key == otherHeapElement.key) && (this.additionalInfo.equals(otherHeapElement.additionalInfo));
    }
}
