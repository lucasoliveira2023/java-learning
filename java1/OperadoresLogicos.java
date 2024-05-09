
public class OperadoresLogicos {

    public static void main(String[] args) {
        int idade = 2;
        char sexo = 'M';

        boolean result = (idade >= 18 && sexo == 'M');
        System.out.println(result);
    }

    static class LogicoSecundario {

        public static void main(String[] args) {
            int idade = 16;
            char sexo = 'M';

            boolean result = !(idade >= 18);
            System.out.println(result);
        }
    }
}
