package webzodziupaieska.lrytas;

import webzodziupaieska.data.HtmlTxt;
import webzodziupaieska.delfi.DelfiParse;
import webzodziupaieska.functionality.ArticleMetaData;

import java.util.ArrayList;
import java.util.List;

public class LRytasParse extends DelfiParse {

    public List<ArticleMetaData> extractMetaData(String txt) {


        HtmlTxt htmlTxt = new HtmlTxt(txt);
        List<ArticleMetaData> dataList = new ArrayList<>();
        ArticleMetaData data = null;
        do {
            data = cutArtData(htmlTxt);
            if (data != null) {// todo
                dataList.add(data);
            }
        } while (data != null);
        return dataList;
    }
}
