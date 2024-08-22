public class brinquedo {
    String nome;
    String faixaEtaria;
    float preco;
    String[] faixasEtariasPossiveis = { "0 a 2", "3 a 5", "6 a 10", "acima de 10" };

    public brinquedo() {

    }

    public brinquedo(String nome) {
        this.nome = nome;
    }

    public brinquedo(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = determinarFaixaEtaria(faixaEtaria, faixasEtariasPossiveis);
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    private static String determinarFaixaEtaria(int idade, String[] faixasEtarias) {
        int indice = idade <= 2 ? 0 : idade <= 5 ? 1 : idade <= 10 ? 2 : 3;
        return faixasEtarias[indice];
    }

}
