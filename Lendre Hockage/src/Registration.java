import java.util.Scanner;
public class Registration {

    public static void regist(){  //Занесение в BD данных пользователя
        int a = 0, b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите под чьим именем вы заходите (1 - Админ    2 - Покупатель)");
        Authorization.BD[a][b] = scan.next();
        b++;
        if (b == 2) {a = a+1; b =0;};
        System.out.println("Введите логин");
        Authorization.BD[a][b] = scan.next();
        b++;
        if (b == 2) {a = a+1; b =0;};
        System.out.println("Введите пароль");
        Authorization.BD[a][b] = scan.next();
        b++;
        if (b == 2) {a = a+1; b =0;};
        System.out.println("Ваши данные: ");
        for(int i = 0; i < 3; i++){
            System.out.println(Authorization.BD[a][i]); // Вывод введенных пользователем данных
        }
    }
}
