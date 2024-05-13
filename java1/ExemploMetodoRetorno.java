public class ExemploMetodoRetorno {
    static double hipotenusa(double cateto1, double cateto2) {
        double temp1 = Math.pow(cateto1, 2);
        double temp2 = Math.pow(cateto2, 2);
        double temp3 = temp1 + temp2;
        double temp4 = Math.sqrt(temp3);

        return temp4;
    }

    public static void main(String[] args) {
        double result = hipotenusa(6.8, 3.2);
        System.out.println("valor da hipotenusa: " + result);
    }
}
