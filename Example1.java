public class Example1 {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 100;
        for (int i = n1; i < n2; i++) {
            if (((i & 1) == 0)) {
                if (i % 3 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}