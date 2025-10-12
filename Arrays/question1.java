package Arrays;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x is found at index: " + i);
            }
        }
    }
}

/*
 * 
 import java.util.*;

public class MajorityElementNBy3 {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> majorityElements = majorityElement(arr);
        System.out.println(majorityElements);
    }
}*/
