public class App {
    public static void main(String[] args) throws Exception {
        int a = 30;
        int b = 5;
        int c = 10;
        int lado = 2;
        lado *= 2; // lado = lado*2;
        
        // + - * / %
        int total = (a + b - c)/10;
        int resto = (30 % 5);
        boolean divisor = ( resto != 0);
        System.out.println(total);
        System.out.println(lado);
        System.out.println(divisor);
    }
}
