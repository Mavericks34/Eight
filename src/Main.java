import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");


        int[] number1 = new int[3];
        for (int as = 0; as < number1.length; as++) {
            number1[as] = as + 1;
            System.out.println(number1[as]);
        }

        double[] number2 = {1.57, 7.654, 9.986};
        for (int sf = 0; sf < number2.length; sf++) {
            System.out.println(number2[sf]);
        }

        int[] number3 = new int[5];
        number3[0] = 11;
        number3[1] = 2;
        number3[4] = 29;
        for (int op = 0; op < 5; op++) {
            System.out.println(number3[op]);
        }


        System.out.println("Task 2");


        int[] number4 = new int[3];
        for (int qw = 0; qw < number4.length; qw++) {
            number4[qw] = qw + 1;
            if (qw < number4.length - 1) {
                System.out.print(number4[qw] + ",");
            } else {
                System.out.print(number4[qw]);
            }
        }
        System.out.println();

        float[] number5 = {1.57f, 7.654f, 9.986f};
        for (int we = 0; we < number5.length; we++) {
            if (we < number5.length - 1) {
                System.out.print(number5[we] + ",");
            } else {
                System.out.print(number5[we]);
            }
        }

        System.out.println();


        int[] number6 = new int[29];
        for (int er = 0; er < number6.length; er++) {
            number6[er] = er + 1;
            if (er < number6.length - 1) {
                System.out.print(number6[er] + ",");
            } else {
                System.out.print(number6[er]);
            }
        }

        System.out.println();
        System.out.println("Task 3");


        int[] number7 = new int[3];
        for (int rt = number7.length - 1; rt >= 0; rt--) {
            number7[rt] = rt + 1;
            if (rt > 0) {
                System.out.print(number7[rt] + ",");
            } else {
                System.out.print(number7[rt]);
            }
        }
        System.out.println();
        for (int lm = number2.length - 1; lm >= 0; lm--) {
            if (lm > 0) {
                System.out.print(number2[lm] + ",");
            } else {
                System.out.print(number2[lm]);
            }
        }
        System.out.println();
        for (int km = number3.length - 1; km >= 0; km--) {
            if (km > 0) {
                System.out.print(number3[km] + ",");
            } else {
                System.out.print(number3[km]);
            }
        }

        System.out.println();
        System.out.println("Task 4");

        int[] number8 = new int[10];
        for (int bs = 0; bs < number8.length ; bs++) {
            number8[bs] = bs + 1;
            if (bs % 2 == 0) {
                number8[bs] += 1;
            }
        }
        System.out.println(Arrays.toString(number8));

    }
}


