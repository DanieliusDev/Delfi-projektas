package webzodziupaieska.funkcionalumas;

import webzodziupaieska.duomenys.ArticleMetaData;
import webzodziupaieska.duomenys.HtmlTxt;

import java.util.ArrayList;
import java.util.List;

public class PaieskaPagalUzklausa {



    public static final String BEGINIMG = "<img class=\"img-responsive lazy\" data-src=\"";
    public static final String ENDIMG = "\" src=\"";

    public static final String BEGINTITLE = "class=\"CBarticleTitle\" >";
    public static final String ENDTITLE = "</a>";

    public static final String HREFBEGIN = "<a href=";
    public static final String HREFEND = "&amp;com=1";


    public List<ArticleMetaData> extractMetaData(String txt) {

        HtmlTxt htmlTxt = new HtmlTxt(txt);

        List<ArticleMetaData> dataList = new ArrayList<>();
        ArticleMetaData data = null;
        do {
            data = cutArtData(htmlTxt);
            if (data != null ) {//todo
                dataList.add(data);
            }

        } while (data != null);


        return dataList;

    }

    private ArticleMetaData cutArtData(HtmlTxt txt) {
        ArticleMetaData meta = new ArticleMetaData();
        CutResult rez = cut(txt, BEGINIMG, ENDIMG);
        if (!rez.isFound()) {
            return null;
        }


        rez = cut(txt, HREFBEGIN, HREFEND);
        meta.setLink(rez.getTarget());
// todo link img title
        meta.setImg(rez.getTarget());
        rez = cut(txt, BEGINTITLE, ENDTITLE);
        meta.setTitle(rez.getTarget());


//        rez = cut(txt, BEGINHREF2, ENDHREF2);
////        meta.setDiffLink(rez.getTarget());
////        rez = cut(txt, BEGINARTICLE2, ENDARTICLE2);
////        meta.setDiffTitle(rez.getTarget());





        return meta;
    }


    private CutResult cut(HtmlTxt txt, String begin, String end) {
        int beginInd = txt.getTxt().indexOf(begin);
        if (beginInd < 0) {
            return new CutResult();
        }


        txt.setTxt(txt.getTxt().substring(beginInd));


        return new CutResult(txt, txt.getTxt().substring(begin.length(), txt.getTxt().indexOf(end)));
    }
}
