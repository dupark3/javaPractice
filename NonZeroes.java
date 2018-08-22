public class NonZeroes{
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 0, 10, 0, 0};
        int[] array2 = {0, 2, 3, 0, 10, 0, 0};
        int[] array3 = {0, 0, 0};
        int[] array4 = {22, -150, 0};

        removeAndPrint(array1);
        removeAndPrint(array2);
        removeAndPrint(array3);
        removeAndPrint(array4);
    }

    public static int[] removeZeroes(int[] array){
        int numberOfNonzeroes = 0;
        for (int i = 0; i != array.length; ++i){
            if (array[i] != 0) ++numberOfNonzeroes;
        }

        // is there a dynamically growing array in java like vector?
        int[] result;
        result = new int[numberOfNonzeroes];

        int index = 0;
        for(int i = 0; i != array.length; ++i){
            if (array[i] != 0){
                result[index] = array[i];
                ++index;
            }
        }
        return result;
    }

    public static void printArray(int[] array){
        if (array.length > 0){
            System.out.print(array[0]);
        }
        for (int i = 1; i < array.length; ++i){
            System.out.print(", " + array[i]);
        }
    }

    public static void removeAndPrint(int[] array){
        System.out.print("passing [");
        printArray(array);
        System.out.print("] got back [");
        printArray(removeZeroes(array));
        System.out.print("]\n");
    }
}
