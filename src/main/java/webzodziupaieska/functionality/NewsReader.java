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

        List<ArticleMetaData> delfi = getListOfData(delfiObj, readerObj);
        List<ArticleMetaData> lrytas = getListOfDataForLRytas(rytasObj, readerObj);

        for (ArticleMetaData strs : delfi) {

            switch (linkName) {
                case DELFI:
                    System.out.println(strs.toString());
                    System.out.println();
                    break;
                case LRYTAS:
                    System.out.println("https://www.lrytas.lt");
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

    private List<ArticleMetaData> getListOfData(DelfiParse di, ReaderDaikts skaito) {
        return di.extractMetaData(skaito.readContent("https://www.delfi.lt").toString());
    }

    private List<ArticleMetaData> getListOfDataForLRytas(LRytasParse lr, ReaderDaikts skaito) {
        return lr.extractMetaData(skaito.readContent("https://www.lrytas.lt").toString());
    }
}