
public class VerificaNumeroPrimo {

    public static void main(String[] args) {
        int numero = 17; // O número que queremos verificar
        int divisoes = 0; // Contador de divisões

        // Laço de repetição for para verificar divisibilidade
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisoes++;
            }
        }

        // Verificando se o número é primo
        if (divisoes <= 2) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
