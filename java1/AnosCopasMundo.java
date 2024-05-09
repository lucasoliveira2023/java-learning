
public class AnosCopasMundo {

    public static void main(String[] args) {
        int ano = 1930; // Ano da primeira Copa do Mundo

        // Utilizando um loop for para iterar sobre os anos das Copas do Mundo
        for (; ano <= 2022; ano += 4) {
            // Verificando se o ano é igual a 1942 ou 1946 e desconsiderando esses anos
            if (ano == 1942 || ano == 1946) {
                continue; // Indo para a próxima iteração do loop
            }
            // Imprimindo o ano da Copa do Mundo
            System.out.println("Ano da Copa do Mundo: " + ano);
        }
    }
}
