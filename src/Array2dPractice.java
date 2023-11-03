public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int[][] array){
        int result = 0;
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[y].length; x++){
                result += array[y][x];
            }
        }
        return result;
    }

    // 2. sumRowN
    public static int sumRowN(int[][] array, int y){
        int result = 0;
        for (int x=0;x<array[y].length; x++)
            result += array[y][x];
        return result;
    }

    // 3. sumColN
    public static int sumColN(int[][] array, int x){
        int result = 0;
        for (int y=0; y<array.length; y++)
            result += array[y][x];
        return result;
    }

    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] array, int y1, int x1,  int y2, int x2){
        int result = 0;
        int currentX = x1;
        int currentY = y1;
        while (!(currentX==x2 && currentY==y2)){
            result += array[currentY][currentX];
            if (currentX == (array[currentY].length - 1)) {
                currentY++;
                currentX = 0;
            }
            else {
                currentX++;
            }
        }
        result += array[y2][x2];

        return result;
    }

    public static void main(String[] args) {
        int[][] array2d = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        System.out.println(Array2dPractice.sumAllCellsBetween(array2d, 1,1,2,1));
    }
}
