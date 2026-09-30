public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        String result = (num % 2 == 0) ? "чётное" : "нечётное";
        System.out.println(num + " число: " + result);
    }
}
