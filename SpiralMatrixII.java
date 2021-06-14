/*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

1 <= n <= 20

*/

class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        
        int rowBegin = 0;
        int rowEnd = n-1;
        int columnBegin = 0;
        int columnEnd = n-1;
        int counter = 1;
        
        while(rowBegin <= rowEnd && columnBegin <= columnEnd) {
            
            for(int index = columnBegin; index <= columnEnd; index++) {
                matrix[rowBegin][index] = counter++;
            }
            
            rowBegin++;
            
            for(int index = rowBegin; index <= rowEnd; index++) {
                matrix[index][columnEnd] = counter++;
            }
            
            columnEnd--;
            
            if(rowBegin <= rowEnd) {
                for(int index = columnEnd; index >= columnBegin; index--) {
                    matrix[rowEnd][index] = counter++;
                }
            }
            
            rowEnd--;
            
            if(columnBegin <= columnEnd) {
                for(int index = rowEnd; index >= rowBegin; index--) {
                    matrix[index][columnBegin] = counter++;
                }
            }
            
            columnBegin++;
            
        }
        
        return matrix;
        
        
    }
}
