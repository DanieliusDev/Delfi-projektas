package webzodziupaieska;

public class Launchas {
    public static void main(String[] args) {

        PaieskaPagalUzklausa ppu = new PaieskaPagalUzklausa();
        ppu.paieska(new ReaderDaikts().readContent("https://www.delfi.lt").toString());

    }
}
