package com.example.Unit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BinarySearchController {

    @Autowired
    private BinarySearchService binarySearchService;

    @GetMapping("/search")
    public String search(@RequestParam int[] array, @RequestParam int target) {
        int result = binarySearchService.binarySearch(array, target);
        return result == -1 ? "Element not found" : "Element found at index " + result;
    }
}
