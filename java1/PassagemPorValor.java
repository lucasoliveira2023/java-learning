
public class PassagemPorValor {
    public static void main(String args[]) {
        
        int valor = 1500;
        //tentativa de alterar o valor
        System.out.println("Antes da chamada do Metodo alterar valor o valor e" + valor);
        alterarValor(valor);
        System.out.println("Depois da chamada do Metodo alterar valor o valor e" + valor);
        System.out.println();

        Pessoa maria = new Pessoa();
        maria.sexo = 'f';
        maria.nome = "Maria";
        maria.idade = 50;

        // tentativa de alterar a referencia do objeto
        System.out.println("Valores antes da chamada do Metodo alterarReferenciaObjeto:");
        maria.exibirdados();
        AlterarReferenciaObjeto(maria);
        System.out.println("Valores depois da chamada do Metodo alterarReferenciaObjeto:");
        maria.exibirdados();
        System.out.println();

        //alterando o conteudo do objeto
        System.out.println("Valores antes da chamada do Metodo alterarConteudoObjeto:");
        maria.exibirdados();
        AlterarConteudoObjeto(maria);
        System.out.println("Valores depois da chamada do Metodo alterarConteudoObjeto:");
        maria.exibirdados();

    }

    static void alterarValor(int valor) {
        //alterando o valor
        valor = 137;
    }

    static void AlterarReferenciaObjeto(Pessoa p) {
        Pessoa ana = new Pessoa();
        ana.sexo = 'f';
        ana.nome = "Ana";
        ana.idade = 18;
        p = ana; //Alterando o valor de p
    }

    static void AlterarConteudoObjeto(Pessoa p) {
        //alterando o conteudo do objeto referenciado por p
        p.sexo = 'm';
        p.nome = "Joao";
        p.idade = 33;
    }
}

class Pessoa {
    char sexo;
    String nome;
    int idade;

    void exibirdados() {
        System.out.println("Nome: " + nome + "sexo: " + sexo + "idade: " + idade);
    }
}