public class Gerente extends Funcionario{
    private int senha;
    
public void setSenha(int senha){
    this.senha = senha;
    }
    
public boolean autentificacao(int senha){
    if(this.senha == senha){ 
        System.out.println("Acesso Permitido!");
        return true;
    }else{
        System.out.println("Acesso Negado!");
        return false;
        }
    }

public double getBonificacao(){
    return this.getSalario() * 0.15;
    }
}