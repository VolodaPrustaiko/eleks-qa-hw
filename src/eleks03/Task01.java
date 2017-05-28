package eleks03;

public class Task01 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        add(n1, n2);
        subtract(n1, n2);
        divide(n1, n2);
        multiply(n1, n2);
    }

    static void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    static void subtract(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    static void divide(int n1, int n2) {
        System.out.println(n1 / n2);
    }

    static void multiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }
}
