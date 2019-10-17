package webzodziupaieska.LaunchMain;

import webzodziupaieska.delfi.DelfiImpl;
import webzodziupaieska.functionality.ArticleMetaData;
import webzodziupaieska.functionality.ReaderDaikts;

import java.util.List;

public class Launchas {
    public static void main(String[] args) {
        //todo what im expected to do below


        //NewsReader nr = new  NewsReader();
        //
        //        sout( nr.generateWithContentOnly(WebNewsPage.DELFI));
        //        sout( nr.generateWithContentOnly(WebNewsPage.LRYTAS));


        DelfiImpl di = new DelfiImpl();
        List<ArticleMetaData> visiStraipsniai = di.extractMetaData(new ReaderDaikts().readContent("https://www.delfi.lt").toString());
        for (ArticleMetaData data : visiStraipsniai) {
            System.out.println(data);
            System.out.println();

        }


    }
}
