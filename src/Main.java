public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 ");

        int oakGreen =   1458125127;
        System.out.println("Значение переменной oakGreen c типом int равно  "  +  oakGreen);

        byte birch = 11;
        System.out.println("Значение переменной birch c типом byte равно  "+birch);

        short pine = 32000;
        System.out.println("Значение переменной pine c типом short равно "+pine);

        long maple = 1000000000;
        System.out.println("Значение переменной maple c типом long равно  "+maple);

        float chestnut = 1.1255f;
        System.out.println("Значение переменной chestnut c типом float равно  "+ chestnut);

        double spruce= 1.23555565;
        System.out.println("Значение переменной spruce c типом double равно  " + spruce);

        System.out.println("Задание 2  Вывод в консоль не произведен , согласно условиям ДЗ ");

        float a =27.12f;
        long b = 987678965549L;
        byte c = 2;
        short d = 786;
        boolean e = c > 5;
        short f =569;
        short g = -159;
        short h = 27897;
        byte i = 67;

        System.out.println("Задание 3 ");

        byte firstGrade = 23;
        byte secondСlass = 27;
        byte  thirdСlass =30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/(firstGrade+secondСlass+thirdСlass)+" листов бумаги. ");

        System.out.println("Задание 4 ");

        byte twoMinutes =16;
        byte twentyMinutes = 10;
        byte dayHour = 24;
        byte threeDays = 24*3;
        short daysMonth = 24*30;
        System.out.println("За 20 минут работы машина произвела " +twoMinutes*twentyMinutes+ " штук ");
        System.out.println("За сутки машина произвела "+(twoMinutes*twentyMinutes)*3*dayHour+" штук ");
        System.out.println("За 3 дня  машина произвела "+ (twoMinutes*twentyMinutes)*3*threeDays+" штук ");
        System.out.println("За 3 месяца  машина произвела "+ (twoMinutes*twentyMinutes)*3*daysMonth +" штук ");

        System.out.println("Задание 5 ");

        byte allPaint= 120;
        byte whitePaint = 2 ;
        byte brownPaint = 4;
        byte totalPaint = 6;
        System.out.println(" В школе , где "+allPaint/totalPaint+ " классов, нужно "+ (allPaint/totalPaint)*whitePaint+" банок белой краски и "+(allPaint/totalPaint)*brownPaint+" банок коричневой краски ");

        System.out.println("Задание 6 ");

        byte bananas = 80;
        byte milk = 105;
        byte iceСream = 100;
        byte eggs = 70;
        float mass = 1000.00f;
        System.out.println("Масса завтрака спортсмена "+(bananas*5+milk*2+iceСream*2+eggs*4)+" грамм ");
        System.out.println("Масса завтрака спортсмена "+(bananas*5+milk*2+iceСream*2+eggs*4)/mass +" кг ");

        System.out.println("Задание 7 ");

        byte extraPounds = 7;
        float firstTarget = 0.25f;
        float secondGoal = 0.5f;
        System.out.println(" На похудения спортсмена потребуется " +extraPounds/firstTarget +" дней если каждый день он будет худеть на  250 грамм ");
        System.out.println(" На похудения спортсмена потребуеться " +extraPounds/secondGoal +" дней если каждый день он будет худеть на  500 грамм ");

        System.out.println();
        System.out.println(" Задание 8 ");
        System.out.println();

        byte period = 12;
        int  maha = 67760;
        double mahaTotal = maha*1.1;
        int denis = 83690;
        float denisTotal =denis*1.1f;
        int kris = 76230;
        double krisTotal= kris*1.1;


        System.out.println(" Маша теперь получает "+ mahaTotal+". Годовой доход вырос на  " +(mahaTotal-maha)*period + " Рублей " );
        System.out.println(" Денис теперь получает "+ denisTotal +". Годовой доход вырос на  " +(denisTotal- denis)*period + " Рублей " );
        System.out.println(" Кристина  теперь получает "+ krisTotal +". Годовой доход вырос на  " +(krisTotal-kris)*period + " Рублей " );
    }


}