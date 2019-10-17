package webzodziupaieska.Paleidimas;

import webzodziupaieska.funkcionalumas.ReaderDaikts;
import webzodziupaieska.funkcionalumas.ArticleMetaData;
import webzodziupaieska.funkcionalumas.PaieskaPagalUzklausa;

import java.util.List;

public class Launchas {
    public static void main(String[] args) {
        PaieskaPagalUzklausa ppu = new PaieskaPagalUzklausa();
        List<ArticleMetaData> visiStraipsniai = ppu.extractMetaData(new ReaderDaikts().readContent("https://www.delfi.lt").toString());
        for (ArticleMetaData data : visiStraipsniai) {
            System.out.println(data);
            System.out.println();

        }


    }
}
