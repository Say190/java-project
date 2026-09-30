public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("=== Проверка чётности ===");
        int num = 7;
        String result = (num % 2 == 0) ? "чётное" : "нечётное";
        System.out.println(num + " - " + result + " число");
    }
}
