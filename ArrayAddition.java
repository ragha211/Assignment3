public class ArrayAddition {public static void main(String[] args) {
    int[][][] arr1 = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}}
    };

    int[][][] arr2 = {
            {{13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}}
    };

    int[][][] result = addArrays(arr1, arr2);

    // Print the result
    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[0].length; j++) {
            for (int k = 0; k < result[0][0].length; k++) {
                System.out.print(result[i][j][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

    public static int[][][] addArrays(int[][][] arr1, int[][][] arr2) {
        int[][][] result = new int[arr1.length][arr1[0].length][arr1[0][0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                for (int k = 0; k < arr1[0][0].length; k++) {
                    result[i][j][k] = arr1[i][j][k] + arr2[i][j][k];
                }
            }
        }
        return result;
    }
}
