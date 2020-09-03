package homework;

public class Arrays {
    public static void main(String[] args) {

        int[] arrey = new int[10];

        for (int i = arrey.length - 1; i >= 0; i--) {
            arrey[i] = i + 1;
            System.out.println(arrey[i]);
        }
    }
}