package webzodziupaieska;

import java.util.List;

public class Launchas {
    public static void main(String[] args) {

        PaieskaPagalUzklausa ppu = new PaieskaPagalUzklausa();
        List<ArticleMetaData> visiStraipsniai = ppu.paieska(new ReaderDaikts().readContent("https://www.delfi.lt").toString());
        for (ArticleMetaData data : visiStraipsniai) {
            System.out.println(data.getTitle());
        }


    }
}
