package ca.bcit.comp2522.termproject.secretwonders;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Entity abstract class.
 * @author Olafson and Mahannah
 * @version 2022
 */
public abstract class Entity extends ImageView {
    /**
     * default width of entity, should be irrelevant unless not overridden.
     */
    protected double width = 16;
    /**
     * default height of entity, should be irrelevant unless not overridden.
     */
    protected double height = 16;
    /**
     * default image of entity, should be irrelevant unless not overridden.
     */
    protected Image sprite = new Image("missingImage.png",
            width, height, false, false);

    /**
     * constructs object of Entity.
     */
    public Entity() {
        super.setImage(sprite);
        setFitHeight(height);
        setFitWidth(width);
    }

    /**
     * constructs object of Entity with given image, width, and height.
     * @param spriteName file name of image.
     * @param width width of image.
     * @param height height of image.
     */
    public Entity(String spriteName, double width, double height) {
        this.width = width;
        this.height = height;
        sprite = new Image(spriteName, width, height, false, false);
        super.setImage(sprite);
        setFitHeight(height);
        setFitWidth(width);
    }

    /**
     * gets width.
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * gets height.
     * @return height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * gets centre of image X coordinate for Entity.
     * @return double X coordinate.
     */
    public double getCenterX() {
        return getX() + (width / 2);
    }

    /**
     * gets centre of image Y coordinate for Entity.
     * @return double Y coordinate.
     */
    public double getCenterY() {
        return getY() + (height / 2);
    }

    /**
     * moves the entity.
     */
    public abstract void doMovement();
}