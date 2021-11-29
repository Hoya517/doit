package book.easyspub.chap01;

public class Max3m {

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("1, 2, 3 :: " + max3(1, 2, 3));
    }
}
