public class ExemploMetodo {

    static void exibirnome(String nome, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Exibindo o nome");
        exibirnome("Lucas", 4);

        System.out.println("Exibindo o nome novamente");
        exibirnome("JAVA",5);
    }
}