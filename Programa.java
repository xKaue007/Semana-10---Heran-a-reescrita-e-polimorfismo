public class Programa{
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        f1.setNome("Eduardo");
        f1.setCpf("123.456.789-10");
        f1.setDepartamento("TI");
        f1.setSalario(2500);
        
        Gerente gerente = new Gerente();
        gerente.setNome("Kaue");
        gerente.setCpf("123");
        gerente.setDepartamento("TI");
        gerente.setSalario(3000);
        
        System.out.println("Nome: "+ f1.getNome());
        System.out.println("Departamento: "+ f1.getDepartamento());
        System.out.println("Salário: R$"+ f1.getSalario());
        System.out.println("CPF: "+ f1.getCpf());
        System.out.println("Bonificação: R$"+ f1.getBonificacao());
        System.out.println("-----------------------------------");
        System.out.println("Nome: "+ gerente.getNome());
        System.out.println("Departamento:"+gerente.getDepartamento());
        System.out.println("CPF: "+ gerente.getCpf());
        System.out.println("Bonificação:R$"+gerente.getBonificacao());
    }
}