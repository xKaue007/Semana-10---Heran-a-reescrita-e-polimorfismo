public class Funcionario{
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String departamento;

    public String getNome(){
        returnnome;
    }

public void setNome(String nome){
    this.nome= nome;
    }

public String getCpf(){
    return cpf;
    }

public void setCpf(String cpf){
    this.cpf= cpf;
    }

public double getSalario(){
    return salario;
    }

public void setSalario(doublesalario){
    this.salario= salario;
    }

public String getDepartamento(){
    return departamento;
    }
    
public void setDepartamento(String departamento){
    this.departamento= departamento;
    }
    
public double getBonificacao(){
    returnthis.salario* 0.10;
    }
}