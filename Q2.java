package Assingment6_PRT;


public class Q2 {
        public boolean searchMatrix(int[][] matrix, int target) {
            // number of rows
            int m = matrix.length;
            // base case condition
            if(m == 0){
                return false;
            }

            // number of columns
            int n = matrix[0].length;

            // binary search algorithm
            int low = 0, high = m * n - 1;
            int midIdx, midElement, rowIdx, colIdx;
            while(low <= high){
                midIdx = low + (high - low)/2;

                rowIdx = midIdx / n;
                colIdx = midIdx % n;

                midElement = matrix[rowIdx][colIdx];

                // condition 1 - match
                if(target == midElement){
                    return true;
                }


                else{
                    if(target < midElement){
                        // condition 2 - left side
                        high = midIdx - 1;
                    }
                    else{
                        // condition 3 - right side
                        low = midIdx + 1;
                    }
                }
            }

            return false;

        }
    }

