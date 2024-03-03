package casa;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    // Construtor
    public Porta() {
        this.aberta = false; // Por padrão, a porta começa fechada
        this.cor = "Sem cor";
        this.dimensaoX = 1.0;
        this.dimensaoY = 2.0;
        this.dimensaoZ = 0.1;
    }

    // Método para abrir a porta
    public void abre() {
        this.aberta = true;
    }

    // Método para fechar a porta
    public void fecha() {
        this.aberta = false;
    }

    // Método para pintar a porta
    public void pinta(String cor) {
        this.cor = cor;
    }

    // Método para verificar se a porta está aberta
    public boolean estaAberta() {
        return this.aberta;
    }

    // Métodos getter e setter para dimensões
    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    // Método para imprimir informações da porta
    public void imprimeInformacoes() {
        System.out.println("Estado da Porta: " + (estaAberta() ? "Aberta" : "Fechada"));
        System.out.println("Cor da Porta: " + this.cor);
        System.out.println("Dimensões da Porta (X x Y x Z): " + this.dimensaoX + " x " + this.dimensaoY + " x " + this.dimensaoZ);
    }

    // Método main para testar a classe Porta
    public static void main(String[] args) {
        // Criando uma porta
        Porta porta = new Porta();

        // Imprimindo informações iniciais
        porta.imprimeInformacoes();

        // Abrindo e fechando a porta
        porta.abre();
        porta.imprimeInformacoes();

        porta.fecha();
        porta.imprimeInformacoes();

        // Pintando a porta de diversas cores
        porta.pinta("Azul");
        porta.imprimeInformacoes();

        porta.pinta("Vermelho");
        porta.imprimeInformacoes();

        // Alterando as dimensões da porta
        porta.setDimensaoX(1.5);
        porta.setDimensaoY(2.5);
        porta.setDimensaoZ(0.2);
        porta.imprimeInformacoes();
    }
}
