import java.util.Scanner;

public class Authorization {
    public static String BD[][] = {{"1","1","1"},{"2","2","2"}};

    public static void author(){

        System.out.println("Введите под чьим именем вы заходите:\n1. Админ 2. Покупатель");
        Scanner scan = new Scanner(System.in);
        String Us = scan.next();
        String L,P;
        boolean flag = false;
        while(flag == false) {
            switch (Us) {
                case "1": {
                    System.out.println("Введите логин и пароль!");
                    L = scan.next();
                    P = scan.next();
                    if (L.equals(BD[0][1]) && P.equals(BD[0][2])) {
                        flag = true;
                        Admin.Menu1();
                    } else System.out.println("Incorrect data");
                    break;
                }

                case "2": {
                    System.out.println("Введите логин и пароль!");
                    L = scan.next();
                    P = scan.next();
                    if (L.equals(BD[1][1]) && P.equals(BD[1][2])) {
                        flag = true;
                        Pokupatel.Menu2();
                    } else System.out.println("Incorrect data");
                    break;
                }
                default:System.out.println("Вы ввели несуществующее значение!");
            }
        }


    }
}
