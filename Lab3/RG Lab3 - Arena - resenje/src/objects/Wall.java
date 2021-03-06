package objects;

import geometry.Vector;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;

public class Wall extends GameObject {

    private final double width;
    private final double height;
    private final double depth;
    
    public static final double DEFAULT_THICKNESS = 100;
    public static final double DEFAULT_HEIGHT = 1000;

    static final PhongMaterial WALL_MATERIAL = new PhongMaterial(Color.rgb(0xFB, 0xFB, 0xFB));

    public Wall(Vector position, double width, double height, double depth) {
        super(position);
        Box wall = new Box(this.width = width, this.height = height, this.depth = depth);
        wall.setMaterial(WALL_MATERIAL);
        this.getChildren().add(wall);
        this.setTranslateX(position.getX());
        this.setTranslateY(position.getY() - height / 2);
        this.setTranslateZ(position.getZ());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}
