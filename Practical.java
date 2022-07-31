
import java.util.*;
public class practical_9 {
    static void Sudoku(int arr1[][],int arr2[][])
    {
        int temp1 = 0;
        for (int i = 0; i < 9; i++) {
            Arrays.sort(arr1[i]);
            for (int j = 0; j < 9; j++) {
                if (arr1[i][j] == j + 1) {
                    continue;
                } else {
                    temp1 = 1;
                    break;
                }
            }
            if (temp1 == 1) {
                break;
            }
        }
        int temp2 = 0;
        for (int i = 0; i < 9; i++) {
            Arrays.sort(arr2[i]);
            for (int j = 0; j < 9; j++) {
                if (arr2[i][j] == j + 1) {
                    continue;
                } else {
                    temp2 = 1;
                    break;
                }
            }
            if (temp1 == 1) {
                break;
            }
        }
        if(temp1==1 || temp2==1)
        {
            System.out.println("NOT A VALID SOLUTION");
        }
        else
        {
            System.out.println("VALID SOLUTION");
        }
        System.out.println("This program is created by Het Patel - 21CE091");
    }
}
