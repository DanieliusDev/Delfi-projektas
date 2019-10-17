package webzodziupaieska.functionality;

import webzodziupaieska.data.NewsPapers;
import webzodziupaieska.delfi.DelfiImpl;

import java.util.List;

public class NewsReader extends DelfiImpl {

    public String generateWithContent(NewsPapers linkName) {
DelfiImpl di = new DelfiImpl();
ReaderDaikts rds = new ReaderDaikts();

       List<ArticleMetaData> delfi = di.extractMetaData(rds.readContent("https://www.delfi.lt").toString());
        for (ArticleMetaData strs: delfi) {
            System.out.println(strs);


        switch (linkName) {
            case DELFI:
                System.out.println( strs.toString());
                System.out.println();
                break;
            case BBC:
                System.out.println("");
                break;
            case LRYTAS:
                System.out.println( "");
                break;
            default:
                return "Page not valid";


        }


    }
        return "";
    }


}
