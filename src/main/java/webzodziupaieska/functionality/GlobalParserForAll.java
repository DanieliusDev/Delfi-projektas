package webzodziupaieska.functionality;

import webzodziupaieska.data.HtmlTxt;

import java.util.List;

public interface GlobalParserForAll {

    public String page();

    public List<ArticleMetaData> extractMeta(String txt);

    public ArticleMetaData cutArtData(HtmlTxt txt);

    public CutResult cut(HtmlTxt txt, String begin, String end);


}
