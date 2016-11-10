public class Main {

    public static void main(String[] args)
    {
        //   1. С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период?
        int proshlo = 234;
        int polnihNedel = proshlo / 7;
        System.out.println("Прошло полных недель - " +polnihNedel);

        //   2.Дан прямоугольник с размерами 543 * 130 мм. Сколько квадратов со стороной 130 мм можно отрезать от него?
        int storonaA = 543;
        int storonaB = 130;
        int kvadrat = 130;

        int poStoroneAShtuk = storonaA/kvadrat;
        int poStoroneBShtuk = storonaB/kvadrat;

        int kolKvadratov = poStoroneAShtuk*poStoroneBShtuk;

        System.out.println("С прямоугольника " +storonaA+ " мм * " +storonaB+ " мм можно отрезать " +kolKvadratov+ " квадрата(ов) со стороной " +kvadrat+ " мм");

        //   3. Дано двузначное число. Найти:
        int chislo = 56;

        int chisloDesyatkov = chislo / 10; //а) число десятков в нем;
        System.out.println("Число десятков в числе "+chislo+ " = " +chisloDesyatkov);

        int chisloEdinic = chislo % 10; //б) число единиц в нем;
        System.out.println("Число единиц в числе "+chislo+ " = " +chisloEdinic);

        int j = chislo; //в) сумму его цифр;
        int summaCifer = 0;
        while (j != 0) {
            summaCifer = summaCifer + (j % 10);
            j /=10;
        }
        System.out.println("Сумма цифер числа " + chislo + " = "+summaCifer);

        //г) произведение его цифр.
        j = chislo;
        int proizvedCifer = 1;
        while (j != 0) {
            proizvedCifer = proizvedCifer * (j % 10);
            j /=10;
        }
        System.out.println("Произведение цифер числа " + chislo + " = "+proizvedCifer);

        //   4.Дано двузначное число. Получить число, образованное при перестановке цифр заданного числа.
        int pervoeChislo = chislo / 10;
        int vtoroeChislo = chislo % 10;
        int perestanovka = vtoroeChislo*10+pervoeChislo;
        System.out.println("Перестановка чисел числа "+chislo+ " = "+ perestanovka);

        //   5.Вычислить значение логического выражения при следующих значениях логических величин А, В и С: А = Истина, В = Ложь, С = Ложь:
        // а) не А и В; б) А или не В; в) А и В или С.
        boolean A = true;
        boolean B = false;
        boolean C = false;
        System.out.println("не А и В = " + (!A & B));
        System.out.println("А или не В = " + (A | !B));
        System.out.println("А и В или С = " + (A & B | C));


        /*   6.Вычислить значение логического выражения при следующих значениях логических величин X, Y и Z: X = Ложь, Y = Ложь, Z = Истина:
        а) X или Y и не Z;
        б) не X и не Y;
        в) не (X и Z) или Y;
        г) X и не Y или Z;
        д) X и (не Y или Z);
        е) X или (не (Y или Z)). */

        boolean X = false;
        boolean Y = false;
        boolean Z = true;
        System.out.println("X или Y и не Z = " + (X | Y & !Z));
        System.out.println("не X и не Y = " + (!X & !Y));
        System.out.println("не (X и Z) или Y = " + (!(X & Z) | Y));
        System.out.println("X и не Y или Z; = " + (X & !Y | Z));
        System.out.println("X и (не Y или Z) = " + (X & (!Y | Z)));
        System.out.println("X или (не (Y или Z)) = " + (X | (!(Y | Z))));

        /*   7.Вычислить значение логического выражения:
        а) x^2 + y^2  <= 4 при x =1, y =-1;
        б) (x >= 0) или (y != 24) при x = 1, y = 2;
        в) (x >= 0) и (y^2 != 4) при x = 1, y = 2;
        г) (x * y != 0) и (y > x) при x = 2, y = 1;
        д) (x * y != 0) или (y < x) при x = 2, y = 1;
        е) (не(x * y < 0)) и (y > x) при x = 2, y = 1;
        ж) (не(x * y < 0)) или (y > x) при x = 1, y = 2. */

        int x, y;
        boolean result;

        x=1; //а) x^2 + y^2  <= 4 при x =1, y =-1;
        y=-1;
        result= x*x+y*y <= 3;
        System.out.println(result);

        x=1; //б) (x >= 0) или (y != 24) при x = 1, y = 2;
        y=2;
        result= (x >= 0) | (y != 24);
        System.out.println(result);

        x = 1; //в) (x >= 0) и (y^2 != 4) при x = 1, y = 2;
        y = 2;
        result = (x >= 0) & (y*y != 4);
        System.out.println(result);

        x=2; //г) (x * y != 0) и (y > x) при x = 2, y = 1;
        y=1;
        result= (x*y != 0) | (y > x);
        System.out.println(result);

        x=2;  //д) (x * y != 0) или (y < x) при x = 2, y = 1;
        y=1;
        result= (x*y != 0) | (y < x);
        System.out.println(result);

        x=2;  //е) (не(x * y < 0)) и (y > x) при x = 2, y = 1;
        y=1;
        result=(!(x*y < 0)) & (y > x);
        System.out.println(result);

        x=1;  //ж) (не(x * y < 0)) или (y > x) при x = 1, y = 2.
        y=2;
        result= (!(x*y < 0)) | (y > x);
        System.out.println(result);







    }

}
