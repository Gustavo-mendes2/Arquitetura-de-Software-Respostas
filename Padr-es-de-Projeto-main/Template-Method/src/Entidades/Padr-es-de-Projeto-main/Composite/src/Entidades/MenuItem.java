package Entidades;

public class MenuItem implements MenuComponente {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("□ " + name);
    }

}
