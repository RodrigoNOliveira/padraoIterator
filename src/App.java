public class App {
        public static void main(String args []) {
            Menu [] menuItens = new Menu[4];
    
            menuItens[0] = new Menu("Item 1");
            menuItens[1] = new Menu("item 2");
            menuItens[2] = new Menu("item 3");
            menuItens[3] = new Menu("item 4");
    
            Iterator menuIterator = new MenuIterator(menuItens);

        while (menuIterator.hasNext()) {
            Menu menuItem = (Menu)menuIterator.next();
            System.out.println(menuItem.nome);
    
        }
        }
}
