package ConceptsCode.PassBy;

public class passbyValue {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = 6, y = 7;
        int sum = add(x, y);
        System.out.printf("x = %d, y = %d, sum = %d\n", x, y, sum);
    }
}
