package webzodziupaieska.functionality;

import webzodziupaieska.data.NewsPapers;
import webzodziupaieska.delfi.DelfiParse;
import webzodziupaieska.lrytas.LRytasParse;

import java.util.List;


public class NewsReader extends DelfiParse {


//    public String callNews (NewsPapers name) {
//
//        if (NewsPapers.DELFI!=null) {
//            System.out.println(generateWithContent(NewsPapers.DELFI));
//        }
//        if (NewsPapers.LRYTAS!=null) {
//            System.out.println(generateWithContent(NewsPapers.LRYTAS));
//        }
//        if (NewsPapers.BBC!=null) {
//            System.out.println(generateWithContent(NewsPapers.BBC));
//        }
//
//        return "Nothing selected";
//    }


    public String generateWithContent(NewsPapers linkName) {
        DelfiParse delfiObj = new DelfiParse();
        ReaderDaikts readerObj = new ReaderDaikts();
        LRytasParse rytasObj = new LRytasParse();
/*
Iskelti kad listus pasiimtu is kitos klases.
Kad paduotu puslapi parsinimui sumazintu kodu.
Cia daroma yra per daug viename metode.
Padaryti kad kvieciant Lryta paduotu Lryta, BBC butu BBC.
*/

        List<ArticleMetaData> delfi = getListOfDelfiData(delfiObj, readerObj);
        List<ArticleMetaData> lrytas = getListOfLrytasData(rytasObj, readerObj);

        for (ArticleMetaData strs : delfi) {

            switch (linkName) {
                case DELFI:
                    System.out.println(strs.toString());
                    System.out.println();
                    break;
                case LRYTAS:
                    System.out.println(lrytas);
                    System.out.println("");
                    break;
                case BBC:
                    System.out.println("BBC");
                    break;
                default:
                    return "Page not valid";
            }
        }
        return "";
    }

    private List<ArticleMetaData> getListOfDelfiData(DelfiParse di, ReaderDaikts skaito) {
        return di.extractMeta(skaito.readContent(di.page()).toString());
    }

    private List<ArticleMetaData> getListOfLrytasData(LRytasParse lr, ReaderDaikts skaito) {
        return lr.extractMeta(skaito.readContent(lr.page()).toString());
    }
}