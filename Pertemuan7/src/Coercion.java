public class Coercion {
    public static void main(String[] args) {

        // a. Coercion
        int nilaiInt = 65;
        System.out.println("Integer: " + nilaiInt);
        System.out.println("Char: " + (char) nilaiInt);
        System.out.println("Double: " + (double) nilaiInt);

        String str = "123";
        System.out.println("String ke int: " + Integer.parseInt(str));
        System.out.println("String ke double: " + Double.parseDouble(str));
        System.out.println("Int ke String: " + Integer.toString(nilaiInt));

        // b. int → double → int
        int a = 10;
        double b = a;
        int c = (int) b;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

        // c. String X & Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("S: " + S + ", Z: " + Z);

        // d. String P & Q
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("R: " + R + ", D: " + D);

        // e. S → Integer
        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);

        // f. A → String
        String T = A.toString();
        System.out.println("T: " + T);
    }
}