package net.maromo.exercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Empresa {

    // ATRIBUTOS
    public int idEmpresa;
    public String razaoSocial;
    public String cnpj;





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



    // MÉTODOS
    public void adicionarEmpregados(){

            System.out.println("FUNCIONARIO ENCONTRADO!");
            System.out.println("Cadastrando funcionario...");


    }

    public void mostrarEmpregados(){
        imprimir();
        Funcionario funcionario = new Funcionario();



    }

    public void contemFuncionario(){

    }

    public void inativarFuncionario(){
        Funcionario funcionario = new Funcionario();
        if (funcionario.getEstaAtivo() == false){
            funcionario.setIdEmpresa(Integer.parseInt(null));
        }
        return;

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
