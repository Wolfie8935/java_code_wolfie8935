// Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing Resizable interface
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int newWidth) {
        if (newWidth > 0) {
            this.width = newWidth;
        } else {
            System.out.println("Invalid width value. Width must be greater than 0.");
        }
    }

    @Override
    public void resizeHeight(int newHeight) {
        if (newHeight > 0) {
            this.height = newHeight;
        } else {
            System.out.println("Invalid height value. Height must be greater than 0.");
        }
    }

    public void displaySize() {
        System.out.println("Width: " + width + " Height: " + height);
    }
}

public class app7 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        
        System.out.println("Original Size:");
        rectangle.displaySize();

        // Resize the rectangle
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);

        System.out.println("Resized Size:");
        rectangle.displaySize();
    }
}
