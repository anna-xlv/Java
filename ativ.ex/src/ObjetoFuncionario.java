import java.util.Scanner;

public class ObjetoFuncionario {

    static class Funcionario {
            String nome;
            String endereco;
            String cpf;
            String telefone;
            String cargo;
            String dataDeAdmisssao;
            String dataDeNascimento;
            String email;
            char sexo;
            String nivelDeEscolaridade;

            public String getNome () {
                return nome;
            }
            public void setNome (String nome) {
                this.nome = nome;
            }
            public String getEndereco () {
                return endereco;
            }
            public void setEndereco (String endereco) {
                this.endereco = endereco;
            }
            public String getCpf () {
                return cpf;
            }
            public void setCpf (String cpf) {
                this.cpf = cpf;
            }
            public String getTelefone () {
                return telefone;
            }
            public void setTelefone (String telefone) {
                this.telefone = telefone;
            }
            public String getCargo () {
                return cargo;
            }
            public void setCargo (String cargo) {
                this.cargo = cargo;
            }
            public String getDataDeAdmisssao () {
                return dataDeAdmisssao;
            }
            public void setDataDeAdmisssao (String dataDeAdmisssao) {
                this.dataDeAdmisssao = dataDeAdmisssao;
            }
            public String getDataDeNascimento () {
                return dataDeNascimento;
            }
            public void setDataDeNascimento (String dataDeNascimento) {
                this.dataDeNascimento = dataDeNascimento;
            }
            public String getEmail () {
                return email;
            }
            public void setEmail (String email) {
                this.email = email;
            }
            public char getSexo () {
                return sexo;
            }
            public void setSexo (char sexo) {
                this.sexo = sexo;
            }
            public String getNivelDeEscolaridade () {
                return nivelDeEscolaridade;
            }
            public void setNivelDeEscolaridade (String nivelDeEscolaridade) {
                this.nivelDeEscolaridade = nivelDeEscolaridade;
            }

    }

    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario funcio = new Funcionario();

        System.out.println("Quantos cadastros são?");
        int ficha = ler.nextInt();

        ler.nextLine();

        for(int i = 0; i < ficha; i++) {

            System.out.println("\n\nInsira seu nome: ");
             funcio.setNome(ler.nextLine());
            System.out.println("Insira seu endereço: ");
             funcio.setEndereco(ler.nextLine());
            System.out.println("Insira seu CPF: ");
             funcio.setCpf(ler.nextLine());
            System.out.println("Insira seu telefone: ");
             funcio.setTelefone(ler.nextLine());
            System.out.println("Insira seu cargo: ");
             funcio.setCargo(ler.nextLine());
            System.out.println("Insira sua data de admissão: ");
             funcio.setDataDeAdmisssao(ler.nextLine());
            System.out.println("Insira sua data de nascimento: ");
             funcio.setDataDeNascimento(ler.nextLine());
            System.out.println("Insira seu email: ");
             funcio.setEmail(ler.nextLine());
            System.out.println("Insira seu gênero (F = Feminino M = Masculino O = Outros):");
             funcio.setSexo(ler.next().charAt(0));
            System.out.println("Insira seu nível de escolaridade: ");
             funcio.setNivelDeEscolaridade(ler.next());
            ler.nextLine();

            System.out.println("\n~~~~~~FICHA~~~~~~");
            System.out.println("Nome: "+funcio.getNome());
            System.out.println("Endereço: "+funcio.getEndereco());
            System.out.println("CPF: "+funcio.getCpf());
            System.out.println("Telefone: "+funcio.getTelefone());
            System.out.println("Cargo: "+funcio.getCargo());
            System.out.println("Data de admissão: "+funcio.getDataDeAdmisssao());
            System.out.println("Data de nascimento: "+funcio.getDataDeNascimento());
            System.out.println("Email: "+funcio.getEmail());
            System.out.println("Gênero: "+funcio.getSexo());
            System.out.println("Nível de escolaridade: "+funcio.getNivelDeEscolaridade());


        }
    }
}
