package sg.edu.rpc346.id19016011.mydatabook;

import java.io.Serializable;

public class Drawer implements Serializable {
    private String name;

    public Drawer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
