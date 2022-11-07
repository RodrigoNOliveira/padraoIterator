class Menu {

    String nome;

    Menu(String nome) {
        this.nome = nome;
    }

}

interface Iterator {
    boolean hasNext();
    Object next();
}

public class MenuIterator implements Iterator {

    Menu[] itens;
    int posicao = 0;

    public MenuIterator(Menu[] itens) {
        this.itens = itens;
    }

    public Object next() {
        Menu menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }

    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }

}