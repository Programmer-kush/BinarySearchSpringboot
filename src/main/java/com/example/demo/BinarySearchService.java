package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class BinarySearchService {

    public int binarySearch(int[] Array, int target) {
        
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<Array.length;i++){
            map.put(Array[i], i);
        }

        Arrays.sort(Array);

        int left = 0, right = Array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Array[mid] == target) return map.get(Array[mid]);
            if (Array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
}
