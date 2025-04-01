package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SearchController {

    @Autowired
    private BinarySearchService binarySearchService;

    @GetMapping("/binary-search")
    public ResponseEntity<?> binarySearch(
            @RequestParam("array") int[] array,
            @RequestParam("target") int target) {

        if (!isSorted(array)) {
            return ResponseEntity.badRequest().body("Array must be sorted");
        }

        int result = binarySearchService.binarySearch(array, target);
        return ResponseEntity.ok(Map.of(
                "array", array,
                "target", target,
                "resultIndex", result
        ));
    }

    private boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
