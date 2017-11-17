import comp.Computer;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("TEST", "TEST", "TEST", 16);
        Computer c2 = new Computer("TEST1", "TEST1", "TEST1", 8 );
        Computer c3 = new Computer("TEST3");

        System.out.println("_______Выводим информацию о первом объекте_______");
        System.out.println(c1.toString());

        c1 = c2;
        System.out.println("_______Переприсваиваем второй объект первому и выводим информацию о первом объекте_______");
        System.out.println(c1.toString());

        c2.setAmountOfRam(32);
        System.out.println("_______Изменяем параметр второго объекта и выводим информацию о первом объекте_______");
        System.out.println(c1.toString());

        c1 = null;
        /*Второй объкт не обнулиться, так как переменная содержит
        копию ссылки на первый объект, а не сам объект*/
        System.out.println("_______Обнуляем первый объект и выводим информацию о втором объекте_______");
        System.out.println(c2.toString());
    }
}
