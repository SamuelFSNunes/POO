package classes;

public class Square extends Rectangle {
    public Square(java.awt.Color color, int posX, int posY, int size) {
        super(color, posX, posY, size, size);
    }

    @Override
    public void setWidth(int size) {
        super.setWidth(size);
        super.setHeight(size);
    }

    @Override
    public void setHeight(int size) {
        super.setWidth(size);
        super.setHeight(size);
    }
}
