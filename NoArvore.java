
class NoArvore {
    private char caractere;
    private NoArvore ladoEsquerdo;
    private NoArvore ladoDireito;

    public NoArvore(char caractere, NoArvore esquerdo, NoArvore direito) {
        this.caractere = caractere;
        this.ladoEsquerdo = esquerdo;
        this.ladoDireito = direito;
    }

    public char getCaractere() {
        return caractere;
    }

    public NoArvore getladoEsquerdo() {
        return ladoEsquerdo;
    }

    public NoArvore getLadoDireito() {
        return ladoDireito;
    }
}