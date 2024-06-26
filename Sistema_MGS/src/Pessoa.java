public class Pessoa {

    private String nome;
    private String alergia;
    private String problemasMedicos;
    private String telefone;
    private String email;

    public Pessoa() {

    }

    public Pessoa(String nome, String alergia, String problemasMedicos, String telefone, String email) {
        this.nome = nome;
        this.alergia = alergia;
        this.problemasMedicos = problemasMedicos;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getProblemasMedicos() {
        return problemasMedicos;
    }

    public void setProblemasMedicos(String problemasMedicos) {
        this.problemasMedicos = problemasMedicos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
