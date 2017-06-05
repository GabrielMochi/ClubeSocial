package clubesocial;

import java.util.ArrayList;
import java.util.List;

public final class Socio {
    
    private long cartao;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private int tempo;
    private List<PedidoAceitacao> pedidos;

    public Socio() {
        this.cartao = 0;
        this.nome = new String();
        this.endereco = new String();
        this.telefone = 0;
        this.email = new String();
        this.tempo = 0;
        this.pedidos = new ArrayList();
    }

    public Socio(long cartao, String nome, String endereco, int telefone, String email, int tempo, List<PedidoAceitacao> pedidos) {
        this.setCartao(cartao);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setTempo(tempo);
        this.setPedidos(pedidos);
    }

    public long getCartao() {
        return cartao;
    }

    public void setCartao(long cartao) {
        this.cartao = cartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public List<PedidoAceitacao> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoAceitacao> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void addPedido(PedidoAceitacao pedido) {
        this.pedidos.add(pedido);
    }
    
    public int sizeOfPedidos() {
        return this.pedidos.size();
    }
    
}
