package Facade;

public class Computer {
    void readFromDvd() {
        Power power = new Power();
        DvdRom dvdRom = new DvdRom();
        Ssd ssd = new Ssd();
        power.on();
        dvdRom.open();
        dvdRom.close();
        ssd.read();
        power.off();
    }
}
