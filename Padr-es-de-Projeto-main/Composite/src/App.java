import Entidades.Menu;
import Entidades.MenuItem;
import Entidades.MenuComponente;

public class App {
    public static void main(String[] args){
        // Criando itens de menu
        MenuItem item1 = new MenuItem("Novo Arquivo");
        MenuItem item2 = new MenuItem("Abrir");
        MenuItem item3 = new MenuItem("Salvar");
        MenuItem item4 = new MenuItem("Copiar");
        MenuItem item5 = new MenuItem("Colar");
        
        // Criando menus compostos
        Menu fileMenu = new Menu("Arquivo");
        Menu editMenu = new Menu("Editar");
        Menu mainMenu = new Menu("Menu Principal");
        
        // Montando a estrutura hierárquica
        fileMenu.add(item1);
        fileMenu.add(item2);
        fileMenu.add(item3);
        
        editMenu.add(item4);
        editMenu.add(item5);
        
        mainMenu.add(fileMenu);
        mainMenu.add(editMenu);
        
        // Mostrando toda a estrutura (Composite em ação!)
        System.out.println("=== ESTRUTURA DO MENU ===");
        mainMenu.show();
    }
}
