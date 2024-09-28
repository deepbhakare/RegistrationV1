package com.api;

    public class BubbleSort {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;

            // Outer loop for each pass
            for (int i = 0; i < n - 1; i++) {
                swapped = false;

                // Inner loop for comparison and swapping
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap the elements if they are in the wrong order
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;  // A swap has occurred
                    }
                }

                // If no swaps occurred, the array is already sorted
                if (!swapped) break;
            }
        }

        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};

            System.out.println("Original Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            bubbleSort(arr);

            System.out.println("\nSorted Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

