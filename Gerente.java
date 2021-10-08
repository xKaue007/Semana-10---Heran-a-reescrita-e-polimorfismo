public class Gerente extends Funcionario{
    private int senha;
    
public void setSenha(intsenha){
    this.senha= senha;
    }
    
public boolean autentificacao(intsenha){
    if(this.senha== senha){ 
        System.out.println("Acesso Permitido!");
        return true;
    }else{
        System.out.println("Acesso Negado!");
        returnfalse;
        }
    }

public double getBonificacao(){
    returnthis.getSalario() * 0.15;
    }
}