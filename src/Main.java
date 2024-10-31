public class Main {
    public static void main(String[] args){
        /*
        1. დათვალეთ 10-დან 100-მდე 5-ის ჯერადი რიცხვების ჯამი
         */
        int n = 10;
        int sum = 0;
        while (n <= 100){
            if (n % 5 == 0){
                sum += n;
            }
            n += 1;

        }
        System.out.println(sum);


        /*
        2. დაადგინეთ რამდენნიშნაა მოცემული მთელი რიცხვი.
         */

        int num = 1469123;
        int exc = 0;

        while (num % 10 > 0){
            exc += 1;
            num = num / 10;

        }
        System.out.println(exc);



        /*
        3. დაადგინეთ რიცხვი არის თუ არა მარტივი.
         */
        int c = 10;
        int x = 1;
        int count = 0;

        while (x < c){
            if (c % x == 0){
                count += 1;
            }
            x += 1;
        }
        if (count > 1){
            System.out.println("shedgenilia");
        }else {
            System.out.println("martivia");
        }

        /*
        4. დაადგინეთ ორი რიცხვის უდიდესი საერთო გამყოფი.
         */
        int num_1 = 5;
        int num_2 = 10;
        int gamyofi = 0;

        if (num_1 > num_2){
            gamyofi = num_2;
        }else {
            gamyofi = num_1;
        }

        while (gamyofi > 0){
            if (num_2 % gamyofi == 0){
                if (num_1 % gamyofi ==0){
                    System.out.println(gamyofi);
                    break;
                }
            }
            gamyofi -= 1;
        }

        /*
        5. შეადგინეთ პროგრამა, რომელიც წარმოადგენს ყველა სამნიშნა რიცხვს,
           რომელი ცუნაშთოდ იყოფა თავისცი ფრთა ჯამზე.
         */
        int number1 = 100;
        int number2 = 999;
        int jami = 0;

        while (number1 <= number2){
            jami = (number1 % 10) + ((number1 / 10) % 10) + ((number1 / 100) % 10);
            if (number1 % jami == 0){
                System.out.println(number1);
            }
            number1 += 1;
        }


    }
}