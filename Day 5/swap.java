import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        int num1, num2;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = num.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = num.nextInt();

        System.out.println("Numbers Before Swapping are: "+num1+" and "+num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1=num1^num2;

        System.out.println("Numbers After Swapping are: "+num1+" and "+num2);

        num.close();

    }
}