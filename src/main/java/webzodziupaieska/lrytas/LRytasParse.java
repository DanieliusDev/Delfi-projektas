package webzodziupaieska.lrytas;

import webzodziupaieska.data.HtmlTxt;
import webzodziupaieska.functionality.ArticleMetaData;
import webzodziupaieska.functionality.CutResult;
import webzodziupaieska.functionality.GlobalParserForAll;

import java.util.List;

public class LRytasParse implements GlobalParserForAll {

    @Override
    public String page() {
        return "https://www.lrytas.lt";
    }

    @Override
    public List<ArticleMetaData> extractMeta(String txt) {


        return null;
    }

    @Override
    public ArticleMetaData cutArtData(HtmlTxt txt) {
        return null;
    }

    @Override
    public CutResult cut(HtmlTxt txt, String begin, String end) {
        return null;
    }
}
