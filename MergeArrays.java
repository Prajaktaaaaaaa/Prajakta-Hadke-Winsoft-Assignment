import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        System.out.println("Merged Array X: " + Arrays.toString(X));
    }

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = m - n - 1;
        int j = 0;
        int k = 0;

        // Move non-zero elements of X to the end
        while (i >= 0 && X[i] == 0)
            i--;

        // Merge X and Y
        while (i >= 0 && j < n) {
            if (X[i] > Y[j]) {
                X[k++] = Y[j++];
            } else {
                X[k++] = X[i--];
            }
        }

        // If elements in Y[] are remaining, copy them to X[]
        while (j < n) {
            X[k++] = Y[j++];
        }
    }
}

