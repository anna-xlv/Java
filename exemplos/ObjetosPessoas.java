public class ObjetosPessoa {
    
    
    
public static void main(String[] args) {

Pessoa pessoal = new Pessoa();
Pessoa pessoa2= new Pessoa ();

pessoal.setNome ("Tom Cruise");
pessoal.setIdade (60);
pessoal.setEndereco ("California, USA");
pessoal.setProfissao ("Ator");

pessoa2.setNome ("Messi");
pessoa2.setIdade (35);
pessoa2.setEndereco ("Miami, USA");
pessoa2.setProfissao("Jogador de Futebol");

System.out.println("ОВЈЕТО 1");
System.out.println(pessoal.getNome());
System.out.println(pessoal.getIdade ());
System.out.println(pessoal.getEndereco());
System.out.println(pessoal.getProfissao());
System.out.println("OBJETO 2");
System.out.println(pessoa2.getNome());
System.out.println(pessoa2.getIdade ());
System.out.println(pessoa2.getEndereco());
System.out.println(pessoa2.getProfissao());
}
}