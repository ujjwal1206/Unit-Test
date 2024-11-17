package com.example.Unit.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchServiceTest {

    private final BinarySearchService binarySearchService = new BinarySearchService();

    @Test
    void testElementFound() {
        int[] array = {1, 2 , 3, 4 ,6, 7};
        int target = 4;
        int result = binarySearchService.binarySearch(array, target);
        assertEquals(3, result, "Expected index of target element 7 is 4");
    }

    @Test
    void testElementNotFound() {
        int[] array = {3, 5 , 6, 7, 8};
        int target = 10;
        int result = binarySearchService.binarySearch(array, target);
        assertEquals(-1, result, "Expected -1 for a target element not found in the array");
    }

    @Test
    void testEmptyArray() {
        int[] array = {};
        int target = 1;
        int result = binarySearchService.binarySearch(array, target);
        assertEquals(-1, result, "Expected -1 for search in an empty array");
    }

    @Test
    void testSingleElementArray() {
        int[] array = {4};
        int target = 4;
        int result = binarySearchService.binarySearch(array, target);
        assertEquals(0, result, "Expected index 0 for a single-element array containing the target");
    }
}
