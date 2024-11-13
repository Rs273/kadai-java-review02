
public class Review02 {

    public static void main(String[] args) {
        for(int i = 1; i < 101; i++) {
            // もし3でも5でも割り切れるならば
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            // もし3で割り切れるならば
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            // もし5で割り切れるならば
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            // それ以外
            } else {
                System.out.println(i);
            }
        }
    }
}
