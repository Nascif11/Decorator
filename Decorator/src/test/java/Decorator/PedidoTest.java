package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPrecoPedido() {
        Pedido pedido = new HamburguerSimples(10.0f);

        assertEquals(10.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComQueijo() {
        Pedido pedido = new Queijo(new HamburguerSimples(10.0f));

        assertEquals(12.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComBacon() {
        Pedido pedido = new Bacon(new HamburguerSimples(10.0f));

        assertEquals(13.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComOvo() {
        Pedido pedido = new Ovo(new HamburguerSimples(10.0f));

        assertEquals(11.5f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoMaisBacon() {
        Pedido pedido = new Queijo(new Bacon(new HamburguerSimples(10.0f)));

        assertEquals(15.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoMaisOvo() {
        Pedido pedido = new Queijo(new Ovo(new HamburguerSimples(10.0f)));

        assertEquals(13.5f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComBaconMaisOvo() {
        Pedido pedido = new Bacon(new Ovo(new HamburguerSimples(10.0f)));

        assertEquals(14.5f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComQueijoMaisBaconMaisOvo() {
        Pedido pedido = new Queijo(new Bacon(new Ovo(new HamburguerSimples(10.0f))));

        assertEquals(16.5f, pedido.getPreco());
    }

    @Test
    void deveRetornarDescricaoPedido() {
        Pedido pedido = new HamburguerSimples();

        assertEquals("Hambúrguer simples", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComQueijo() {
        Pedido pedido = new Queijo(new HamburguerSimples());

        assertEquals("Hambúrguer simples + Queijo", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComBacon() {
        Pedido pedido = new Bacon(new HamburguerSimples());

        assertEquals("Hambúrguer simples + Bacon", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComOvo() {
        Pedido pedido = new Ovo(new HamburguerSimples());

        assertEquals("Hambúrguer simples + Ovo", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComQueijoMaisBacon() {
        Pedido pedido = new Queijo(new Bacon(new HamburguerSimples()));

        assertEquals("Hambúrguer simples + Bacon + Queijo", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComQueijoMaisOvo() {
        Pedido pedido = new Queijo(new Ovo(new HamburguerSimples()));

        assertEquals("Hambúrguer simples + Ovo + Queijo", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComBaconMaisOvo() {
        Pedido pedido = new Bacon(new Ovo(new HamburguerSimples()));

        assertEquals("Hambúrguer simples + Ovo + Bacon", pedido.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPedidoComQueijoMaisBaconMaisOvo() {
        Pedido pedido = new Queijo(new Bacon(new Ovo(new HamburguerSimples())));

        assertEquals("Hambúrguer simples + Ovo + Bacon + Queijo", pedido.getDescricao());
    }

}
