import java.util.Scanner;

class greater {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = num.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = num.nextInt();
        System.out.println("Enter Third Number: ");
        num3 = num.nextInt();

        if (num1 > num2) {
            if (num1 > num3)
                System.out.println("Greatest Number is: " + num1);
            else
                System.out.println("Greatest Number is: " + num3);

        } else {
            if (num2 > num3)
                System.out.println("Greatest Number is: " + num2);
            else
                System.out.println("Greatest Number is: " + num3);
        }

        num.close();

    }
}