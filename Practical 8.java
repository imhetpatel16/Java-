public class practical_8 {
    void exam() {
        char student[][] = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char ans[] = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int a[] = new int[10];
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                
                if (student[i][j] == ans[j]) {
                    a[i]++;
                }
            }
            
        }
        for (int k = 0; k < 8; k++) {
            System.out.println("Student " + (k + 1) + " Score " + a[k] + " Marks out of 10 Marks");
        }
        
    }
}
