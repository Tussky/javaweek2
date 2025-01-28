package exercise3;

public class FindPay {
    public static void findpay(double hrs, double base_p){
        if (60 < hrs) {
            System.out.println("Invalid number of hours, must be lower than 60hrs.");
        }
        if (8.00 > base_p){
            System.out.println("Invalid base pay, must be greater than $8.00");
        }

        double subtotal = 0;
        if (40 < hrs){
            subtotal = (hrs - 40) * (1.5 * base_p);
            hrs = 40;
        }

        System.out.println("Pay the employee: "+ ((hrs * base_p) + subtotal));

    }
    public static void main(String[] args) {
        FindPay.findpay(50, 10);        
    }
}
