import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Cat или Dog?");
        String name = sc.nextLine();

        if (name.equals("Dog")) {
            sc.nextLine();
            System.out.println("Введите длину бега: ");
            int hehe = sc.nextInt();
            sc.nextLine();

            System.out.println("Введите высоту прыжка: ");
            double hoho = sc.nextDouble();
            sc.nextLine();

            System.out.println("Введите длину плавания: ");
            int haha = sc.nextInt();
            Dog Spoki = new Dog();

            Spoki.run(hehe);
            Spoki.jump(hoho);
            Spoki.swim(haha);
        }

        if (name.equals("Cat")) {
            System.out.println("Введите длину бега: ");
            int hehe = sc.nextInt();

            System.out.println("Введите высоту прыжка: ");
            double hoho = sc.nextDouble();

            System.out.println("Введите длину плавания: ");
            int haha = sc.nextInt();
            Cat Shawerma = new Cat();

            Shawerma.run(hehe);
            Shawerma.jump(hoho);
            Shawerma.swim(haha);
        }
    }
}
