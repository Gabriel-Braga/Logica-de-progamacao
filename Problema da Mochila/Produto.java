public class Produto {
//Atributos
    public String nome;
    public float peso;
    public float valor;
    public float id;
    
// Construtor
    public Produto(String n, float p, float v) {
        this.nome = n;
        this.peso = p;
        this.valor = v;
        this.id = v/p;
    }
}
