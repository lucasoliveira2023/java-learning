public class VerificaDiasMes {

    public static void main(String[] args) {
        String mes = "Janeiro"; // Nome do mês escolhido

        // Utilizando a estrutura switch para determinar a quantidade de dias do mês
        switch (mes.toLowerCase()) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println("O mês " + mes + " tem 31 dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println("O mês " + mes + " tem 30 dias.");
                break;
            case "fevereiro":
                System.out.println("O mês " + mes + " tem 28 ou 29 dias.");
                break;
            default:
                System.out.println("Erro: Mês inválido.");
        }
    }
}
