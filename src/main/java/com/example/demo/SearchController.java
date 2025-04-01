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

        int result = binarySearchService.binarySearch(array, target);
        return ResponseEntity.ok(Map.of(
                "array", array,
                "target", target,
                "resultIndex", result
        ));
    }

 
}
