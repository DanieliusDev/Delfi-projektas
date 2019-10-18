package webzodziupaieska.lrytas;

import webzodziupaieska.data.HtmlTxt;
import webzodziupaieska.delfi.ExtractMetaDataForAll;
import webzodziupaieska.functionality.ArticleMetaData;

import java.util.ArrayList;
import java.util.List;

public class LRytasParse extends ExtractMetaDataForAll {
    public String page() {
        return "https://www.lrytas.lt";
    }

    public List<ArticleMetaData> extractMeta(String txt) {


        HtmlTxt htmlTxt = new HtmlTxt(txt);
        List<ArticleMetaData> dataList = new ArrayList<>();
        ArticleMetaData data = null;

        return dataList;
    }
}
