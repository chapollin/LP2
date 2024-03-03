package banco;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean ativo;
    private String setor;
    private String dataNascimento;

    // Construtor padrão
    public Funcionario() {
    }

    // Construtor com parâmetros
    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg, boolean ativo, String setor, String dataNascimento) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.ativo = ativo;
        this.setor = setor;
        this.dataNascimento = dataNascimento;
    }

    // Métodos getter e setter para as propriedades

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método bonifica
    public void bonifica(double aumento) {
        this.salario += aumento;
    }

    // Método demite
    public void demite() {
        this.ativo = false;
    }

    // Método mostra
    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Ativo: " + this.ativo);
        System.out.println("Setor: " + this.setor);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
    }
}
