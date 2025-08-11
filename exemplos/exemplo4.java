public class exemplo4 {

    public static void main(String[] args) {

        pessoa pessoa1 = new pessoa();
        pessoa pessoa2 = new pessoa();

        pessoa1.setNome ("Tom Cruise");
        pessoa1.setIdade (60);
        pessoa1.setEndereco ("California, USA");
        pessoa1.setProfissao ("Ator");

        pessoa2.setNome ("Messi");
        pessoa2.setIdade (35);
        pessoa2.setEndereco ("Miami, USA");
        pessoa2.setProfissao ("Jogador de Futebol");

        System.out.println(" OBJETO 1");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getProfissao());
        System.out.println(" \nOBJETO 2");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getEndereco());
        System.out.println(pessoa2.getProfissao());
    }
}
