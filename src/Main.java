public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        for (int z = 1; z <= 10; z++){
            System.out.print(z + " ");}
        System.out.println();

        for (int x = 10; x > 0; x--){
            System.out.print(x + " ");}
        System.out.println();

        System.out.println("Задание 3.");
        //. Задание 3.
        {
            int year = 0;
            while (year < 2022) {
                year = year + 79;

                if (year >= 1822)
                    System.out.println("Комета прилетит и возможно всех убьет в " + year + " Году." + " Всем приятного дня и отличного настроения!");
            }
            System.out.println("Задание 2.");


            for (int f = 1; f < 31; f = f + 7){
                System.out.println("Сегодня пятница " + f + " Число. " + " Каждую пятницу я в говно!");
                if (f % 7 != 0)
                    System.out.println("Но каждый понедельник я огурцом, но каждую пятницу я в говно!");
                if (f == 29)
                    System.out.println("Каждую пятницу, каждую пятницу, каждую пятницу я в говно!");



//. В задании 3 есть "условие" : "Для вычисления периода МОЖНО создать две дополнительные переменные..."
                //. Так как "Можно" это не "Нужно!" то я пропущу его.
            }}}}