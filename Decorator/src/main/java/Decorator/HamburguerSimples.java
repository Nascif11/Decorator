package Decorator;

public class HamburguerSimples implements Pedido {

    private float preco;

    public HamburguerSimples() {
        this.preco = 10.0f;
    }

    public HamburguerSimples(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Hambúrguer simples";
    }
}