public class Nomes {
    
    private String nome;
    
    public String inverterNome(String nomeContrario){
        StringBuilder stringBuilder = new StringBuilder(nomeContrario);
        return stringBuilder.reverse().toString().toUpperCase();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
