package com.alexandresouva.javadojo.introduction;

public class Arrays {
    public static void main(String[] args) {
        int[] ages = {10, 20, 30, 40, 50}; // create and set values
        String[] names = new String[]{"Alex", "Jordan", "Taylor"}; // array of Strings
        double[] prices = new double[5]; // array with 5 elements (default values)

        // ------------------------------------//
        // 🧩 Multidimensional arrays
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(matrix[0][1]); // Output: 2 (row 0, column 1)

        // You can also declare arrays where only the first dimension is fixed
        String[][] matrixStr = new String[4][];
        // Here, 'matrixStr' has 4 rows, but each row can have different lengths

        // ------------------------------------//
        // 🚨 Important notes:
        // - Array size is fixed once initialized.
        // - Arrays can store primitives or objects.
        // - Default values: 0 for numbers, false for booleans and null for objects.
    }
}
