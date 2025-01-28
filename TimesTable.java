package exercise3;

public class TimesTable {
    public static void main(String[] args) {
        for (int i = 1; i < 14; i++){
            System.out.println();
            System.out.println(i+ " TIMES TABLE");
            System.out.println();
            for (int c = 1; c < 14; c++){
                System.out.println(i+" times "+c+" = "+i*c);
            }
        }
    }
}
