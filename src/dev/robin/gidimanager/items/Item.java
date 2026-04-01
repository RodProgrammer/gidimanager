package dev.robin.gidimanager.items;

import java.awt.image.BufferedImage;

public abstract class Item extends ItemData {

    protected String name;
    protected String description;
    protected BufferedImage image;

    public Item(String name, String description, BufferedImage image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public BufferedImage getImage() {
        return image;
    }

}
