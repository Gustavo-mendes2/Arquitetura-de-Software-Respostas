package Entidades;

import java.util.List;
import java.util.ArrayList;

public class Menuu implements MenuComponente {
    private String name;
    private List<MenuComponente> children;

    public Menuu(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(MenuComponente item) {
        children.add(item);
    }

    public void remove(MenuComponente item) {
        children.remove(item);
    }

    @Override
    public void show() {
        System.out.println("© " + name);
        for (MenuComponente child : children) {
            child.show();

        }
    }
}
