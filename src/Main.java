import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main obgMain = new Main();
        obgMain.task1();
        obgMain.task2();
        obgMain.task3();
        obgMain.answer();



    }
    void task1() {
        double a = 1.54;
        double b = 0.49;
        double c = 24.1;
        double d = 0.87;
        double y = 2*(sqrt(sin(a)/abs(tan(b-a))+log(c) / (d)));
        System.out.println(y);
    }

    void task2() {

        double a = 2.54;
        double b = 1.23;
        double c = -2.14;
        double d = -0.23;
        double y;
        y = 2*(cos(pow(a,b))+abs(cos(-sqrt(c/d))));
        System.out.println(y);
    }


    void task3() {

        double a = -3.45;
        double b = -2.34;
        double c = 1.45;
        double d = 0.83;
        double y;
        y = 5*(c/cos(a)+sqrt(sinh(abs(b)*c)/tan(d)));
        System.out.println(y);
    }

    void answer(){

        System.out.println("Answers for questions");
        System.out.println("1. Ключові слова в мові програмування мають спеціальне призначення, тоді як зарезервовані слова в майбутньому можуть бути використані користувачем..");

        // Відповідь на друге питання
        System.out.println("2. Примітивні типи даних: byte, short, int, long, float, double, char, boolean. Наприклад, int для віку людини, float для заробітної платні, boolean для визначення чи є автівка червоною.");

        // Відповідь на третє
        System.out.println("3. Знакові типи мають знак (+ або -), беззнакові не мають. В Java всі примітивні типи, окрім char, є знаковими.");

        // Відповідь на четверте
        System.out.println("4. Максимальні числа: short - 32767, char - 65535, int - 2147483647, long - 9223372036854775807.");

        // Відповідь на п'яте
        System.out.println("5. Діапазон byte -128..127 тому, що byte займає 8 біт. Від’ємних значень більше на одне через представлення 0.");

        // Відповідь на шосте
        System.out.println("6. Система числення - це спосіб представлення чисел. Можна переводити значення з однієї системи в іншу.");

        // Відповідь на сьоме
        System.out.println("7. 'Доповняльний код' - це спосіб представлення від’ємних чисел в двійковій системі.");

        // Відповідь на восьме
        System.out.println("8. Результат буде некоректний через переповнення типу int.");

        // Відповідь на дев'яте
        System.out.println("9. Float використовує 32 біти, а double 64 біти.");

        // Відповідь на десяте
        System.out.println("10. Число з рухомою комою має мантису та степінь.");

        // Відповідь на одинадцяте
        System.out.println("11. Double.NaN - 'Not a Number'.");

        // Відповідь на дванадцяте
        System.out.println("12. Результат буде false, тому що NaN не дорівнює NaN.");

        // Відповідь на тринадцяте
        System.out.println("13. Преінкремент (++x) збільшує x перед використанням, постінкремент (x++) після.");

        //Відповідь на чотирнадцяте
        System.out.println("14. Логічна AND (&&) короткозамкнута, побітова (&) ні.");

        // Відповідь на п'ятнадцяте
        System.out.println("15. OR - логічне 'або', XOR - виключне 'або'.");

        // Відповідь на шістнадцяте
        System.out.println("16. Результат a буде false, результат b буде true.");
    }
}