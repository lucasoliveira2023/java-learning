
public class Conta {

    private int matricula = 18;  // Variável de instância

    public void CalcularAlgo() {
        int matricula = 32;  // Variável local, oculta a variável de instância

        System.out.println(matricula);  // Imprime a variável local (32)

        System.out.println(this.matricula);  // Imprime a variável de instância (18)
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.CalcularAlgo();
    }
}
