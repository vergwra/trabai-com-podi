import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;

import Database.*;
import Paginas.*;

public class App {
    public static void main(String[] args) {
        Database.main(args);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login(new Home()).setVisible(true);
            }
        });

    }
}

class Product implements Serializable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class User implements Serializable {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
