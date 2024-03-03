package casa;

public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    // Construtor
    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

    // Método para pintar a casa
    public void pinta(String cor) {
        this.cor = cor;
    }

    // Método para obter a quantidade de portas abertas na casa
    public int quantasPortasEstaoAbertas() {
        int contador = 0;

        if (porta1.estaAberta()) {
            contador++;
        }

        if (porta2.estaAberta()) {
            contador++;
        }

        if (porta3.estaAberta()) {
            contador++;
        }

        return contador;
    }

    // Método para imprimir informações da casa
    public void imprimeInformacoes() {
        System.out.println("Cor da Casa: " + this.cor);
        System.out.println("Quantidade de Portas Abertas: " + quantasPortasEstaoAbertas());
    }

    public static void main(String[] args) {
        // Criando uma casa
        Casa minhaCasa = new Casa("Branco");

        // Imprimindo informações iniciais
        minhaCasa.imprimeInformacoes();

        // Pintando a casa de azul
        minhaCasa.pinta("Azul");
        minhaCasa.imprimeInformacoes();

        // Abrindo e fechando as portas
        minhaCasa.porta1.abre();
        minhaCasa.porta2.abre();
        minhaCasa.porta3.abre();
        minhaCasa.imprimeInformacoes();

        minhaCasa.porta1.fecha();
        minhaCasa.porta3.fecha();
        minhaCasa.imprimeInformacoes();
    }
}
