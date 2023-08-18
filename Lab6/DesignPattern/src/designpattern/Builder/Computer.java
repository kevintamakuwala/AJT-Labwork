package designpattern.Builder;

/**
 *
 * @author user1
 */
public class Computer {

    int ram, storage;
    String processor, graphics;

    public Computer(int ram, int storage, String processor, String graphics) {
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.graphics = graphics;
    }

    public void printConfiguration() {
        System.out.println(
                "Ram: " + ram
                + "\nStorage: " + storage
                + "\nProcessor: " + processor
                + "\nGraphics: " + graphics
        );

    }
}
