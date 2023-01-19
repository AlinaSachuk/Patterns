package Facade;

public class DvdRom {
    private boolean status;

    void open() {
        status = true;
    }

    void close() {
        status = false;
    }
}
