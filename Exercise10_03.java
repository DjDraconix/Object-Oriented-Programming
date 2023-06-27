
public class Exercise10_03 {

	public static void main(String[] args) {
        MyInteger int1 = new MyInteger(23);
        MyInteger int2 = new MyInteger(56);
        MyInteger int3 = new MyInteger(2);
        MyInteger int4 = new MyInteger(23);

        System.out.printf("%d is prime? %s%n", int1.getMyInteger(), int1.isPrime());
        System.out.printf("%d is prime? %s%n", int2.getMyInteger(), int2.isPrime());
        System.out.printf("%d is prime? %s%n", int3.getMyInteger(), int3.isPrime());

        System.out.printf("%d is even? %s%n", int1.getMyInteger(), int1.isEven());
        System.out.printf("%d is even? %s%n", int2.getMyInteger(), int2.isEven());
        System.out.printf("%d is even? %s%n", int3.getMyInteger(), int3.isEven());

        System.out.printf("93 is odd? %s%n", MyInteger.isOdd(93));
        
        System.out.printf("%d equals %d? %s%n", int1.getMyInteger(), int4.getMyInteger(), int1.equals(int4));
        System.out.printf("%d equals 56? %s%n", int1.getMyInteger(), int1.equals(56));

        System.out.printf("%d%n", MyInteger.parseInt(new char[] {'1', '5', '6'}));
        System.out.printf("%d%n", MyInteger.parseInt("454"));
    }
}