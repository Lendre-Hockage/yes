import java.util.Scanner;

public class Admin {
  public static String Dob(){
      String LIST ="", predl;
      boolean flag = false;

          Scanner scan = new Scanner(System.in);


          System.out.println("Введите название товара!");
          predl = scan.nextLine();
          LIST = LIST.concat(predl);
          System.out.println("Вывести список?\n1.Да     2.Нет    3.Закончить заполнение");
          String A = "";
          A = scan.next();
          switch (A) {
              case "1":
                  System.out.println(LIST);
                  break;
              case "2":
                  break;
              case "3": flag = true;break;
              default:System.out.println("Ну ты специально? Нет?");
          }
return LIST;
    }
    public static void Menu1() {

        System.out.println("Вы вошли как администратор!");
        boolean flag = false;
        while (flag == false) {
            System.out.println("Что бы вы хотели сделать: \n1.Добавить товар на продажу   2.Очистить список     3.Просмотреть отзывы   4.Выйти");
            Scanner scan = new Scanner(System.in);
            String Act = scan.next();
            switch (Act) {
                case "1":Dob();break;
                case "2":System.out.println("Список очищен!");break;
                case "3":
                    int a = 0, b = 10;
                    for (int i = 0; i < 3; i++) {
                        int random_number = a + (int) (Math.random() * b);
                        switch (random_number) {
                            case 0:
                                System.out.println("Всё понравилось! Очень вкусно!");
                                break;
                            case 1:
                                System.out.println("Фу! Я помню как мы мидии жарили когда-то! Они так воняли, я до сих пор помню...");
                                break;
                            case 2:
                                System.out.println("Мне не понравилось...");
                                break;
                            case 3:
                                System.out.println("Отлично! Всё супер!");
                                break;
                            case 4:
                                System.out.println("Мне по нраву");
                                break;
                            case 5:
                                System.out.println("Ну я думаю что воспользуюсь в следующий раз");
                                break;
                            case 6:
                                System.out.println("Неплохой магазин, цены приемлемые");
                                break;
                            case 7:
                                System.out.println("Да это жоско");
                                break;
                            case 8:
                                System.out.println("Ееееее боййййййй");
                                break;
                            case 9:
                                System.out.println("Да, магазин хороший, меня всё устроило");
                                break;
                            case 10:
                                System.out.println("Никому бы не порекомендовал");
                                break;
                        }
                    }break;
                case "4": flag = true;break;
                default:System.out.println("Ну ты издеваешся? Нет?");
            }
        }
    }
}
