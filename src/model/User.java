package model;

//Classe usuário responsável por armazenar os dados do usuário e contém
//o método VisualizarPerfil, que mostra os dados de outro usuário na tela.
public class User {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public User(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Método VisualizarPerfil
    public void VisualizarPerfil(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("ID: " + id);
    }

    /*
    Classe Mentora responsável por armazenar os dados das mentoras e contém o atributo
    de AreaDeEspecializacao que contém o nome da área de especialização.
    Essa classe tem o método OferecerMentoria, que envia uma solicitação de mentorista
    para o mentorado selecionado.
    Ela herda os atributos da classe User, como id, nome, email e senha.
    */
    class Mentora extends User{
        public Mentora(int id, String nome, String email, String senha) {
            super(id, nome, email, senha);
        }
        private String AreaDeEspecializacao;

        //Getter
        public String getAreaDeEspecializacao() {
            return AreaDeEspecializacao;
        }

        //Setter
        public void setAreaDeEspecializacao(String AreaDeEspecializacao) {
            this.AreaDeEspecializacao = AreaDeEspecializacao;
        }

        public void OferecerMentoria(){
            System.out.println("Mentoria Oferecida a:"+getNome());
            //Necessário fazer uma maneira de enviar essa solicitação para o mentorado.
        }

    }

}
