/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.Builder;

/**
 *
 * @author user1
 */
public class ComputerBuilder {

    int ram, storage;
    String processor, graphics;

    public int getRam() {
        return ram;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public int getStorage() {
        return storage;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public String getProcessor() {
        return processor;
    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public String getGraphics() {
        return graphics;
    }

    public ComputerBuilder setGraphics(String graphics) {
        this.graphics = graphics;
        return this;
    }

    public Computer computerBuilder() {
        return new Computer(ram, storage, graphics, processor);
    }
}
