package webzodziupaieska.functionality;

import webzodziupaieska.data.NewsPapers;
import webzodziupaieska.delfi.DelfiImpl;

import java.util.Collection;

public class NewsReader extends DelfiImpl {

    public String generateWithContent(NewsPapers linkName) {
DelfiImpl di = new DelfiImpl();
ReaderDaikts rds = new ReaderDaikts();

       Collection delfi = di.extractMetaData(rds.readContent("https://www.delfi.lt").toString());
        for (Object strs: delfi) {
            System.out.println(strs);


        switch (linkName) {
            case DELFI:
                return   strs.toString();
            case BBC:
                return "";
            case LRYTAS:
                return "";
            default:
                return "Page not valid";


        }


    }
        return "";
    }


}
