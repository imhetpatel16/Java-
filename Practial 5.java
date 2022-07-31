import static java.lang.Math.min;

public class practical_5 {
    Ass_5(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }
        System.out.println("stringMatch(\"" + a + "\", \"" + b + "\") --> " + count);
    }
}
