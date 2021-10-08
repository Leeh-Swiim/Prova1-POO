package net.maromo.exercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Empresa {

    // ATRIBUTOS
    public int idEmpresa;
    public String razaoSocial;
    public String cnpj;

    public int idEmpregados;
    public String nomeEmpregados;



    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getIdEmpregados() {
        return idEmpregados;
    }

    public void setIdEmpregados(int idEmpregados) {
        this.idEmpregados = idEmpregados;
    }

    public String getNomeEmpregados() {
        return nomeEmpregados;
    }

    public void setNomeEmpregados(String nomeEmpregados) {
        this.nomeEmpregados = nomeEmpregados;
    }

    // MÉTODOS
    public void adicionarEmpregados(){
        Funcionario funcionario = new Funcionario();
        idEmpregados=funcionario.getIdFunc();
        nomeEmpregados=funcionario.getNomeFunc();

            System.out.println("FUNCIONARIO ENCONTRADO!");
            System.out.println("Cadastrando funcionario...");


    }

    public void mostrarEmpregados(){
        imprimir();
        System.out.println("EMPREGADOS: ");
        System.out.println("-------------------------------");
        System.out.println("ID: " + getIdEmpregados());
        System.out.println("Nome: " + getNomeEmpregados());


    }

    public void contemFuncionario(){

    }

    public void inativarFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setEstaAtivo(false);
        if (funcionario.getEstaAtivo() == false){
            System.out.println("Empregado demitido!");
        }

    }

    public void mostrarFuncionariosAtivos(){

    }
    public void imprimir(){
        System.out.println("\nDados da Empresa");
        System.out.println("------------------------------------------------");
        System.out.println("ID: " + idEmpresa);
        System.out.println("Razao Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("------------------------------------------------");
    }
}
