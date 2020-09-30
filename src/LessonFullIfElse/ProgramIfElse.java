package LessonFullIfElse;

public class ProgramIfElse {
    public static void main(String[] args) {

        // На данном уроке мы с вами рассмотрим полную форму условного оператора if
        // Ранее мы уже знакомились с этим оператором и выяснили что он выполняется тогда, когда нам нужно выполнять
        // какой то код, в зависимости от тех или иных условий

        // Всмомним какой вид имеет выражение с условным оператором if

        // if (условие) {
        // оператор1;
        // оператор2;
        // }

        // Но что если у нас есть несколько разных условий и в зависимости от разных условий нам нужно выполнять другой код
        // другие команды или другие операторы

        // if (условие) оператор;  // если условие истинно, то выполняется первый оператор
        // else оператор;          // если условие ложно, то выполняется оператор после else

        // Давай сразу рассмотрим эту форму на практике


        // допустим у нас есть переменная:

        int i = 5;

        if (i == 5) System.out.println("Переменная i равна 5");
        else System.out.println("Переменная i не равна 5");

        // Видим что в консоль у нас вывелась строка "Переменная i равна 5"
        // а теперь поменяем значение переменной i на число 10

        // (запустим программу) видим что теперь вывелась строка "Переменная i не равна 5"

        // Но что если у нас вариантов выполнения кода больше двух, в таком случае используется следующая форма

//        if (условие){
//             оператор1;
//             оператор2;
//        } else if (условие2) {
//             оператор3;
//             оператор4;
//        } else if (условие3) {
//            оператор5;
//            оператор6;
//        } else {
//             оператор7;
//             оператор8;
//        }

        // с if всегда форма начинается, мы не можем начать форму с else иди c else if , всегда начинается с if
        // и далее каждое новое условие должно начинаться с else if , а в самом конце , если ни одно условие не было
        // выполнено , то выполняется блок операторов который находится в теле else

        // Давайте перейдем к реальному примеру

        // предположим что у нас программа определяет время года по номеру месяца в году
        // итак , у нас есть переменная

        int month = 18;  // Май

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11){
            System.out.println("Осень");
        } else {
            System.out.println("Такого месяца нет");
        }




    }
}
