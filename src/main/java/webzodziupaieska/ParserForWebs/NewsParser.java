package webzodziupaieska.ParserForWebs;
import webzodziupaieska.funkcionalumas.ArticleMetaData;
import webzodziupaieska.duomenys.HtmlTxt;
import webzodziupaieska.funkcionalumas.CutResult;
import webzodziupaieska.funkcionalumas.PaieskaPagalUzklausa;
import java.util.ArrayList;
import java.util.List;
public class NewsParser extends PaieskaPagalUzklausa {

    public static final String LINK_BEGINS_STR = " ";
    public static final String LINK_END_STR = " ";
    public static final String ART_STR_TAG = " ";
    public static final String ART_STR_END_TAG = " ";
    public static final String IMG_TAG_START = " ";
    public static final String IMG_TAG_END = " ";

    public static final String ART_LINK_START = " ";
    public static final String ART_LINK_END = " ";

    public static final String ART_IMG_START = " ";
    public static final String ART_IMG_END = " ";

    public static final String BEGIN_TITLE = " ";
    public static final String END_TITLE = " ";

    @Override
    public List<ArticleMetaData> extractMetaData(String txt) {

        HtmlTxt htmlTxt = new HtmlTxt(txt);
        List<ArticleMetaData> dataList = new ArrayList<>();
        ArticleMetaData data = null;
        do {
            data = cutArtData(htmlTxt);
            if (data != null) {
                dataList.add(data);
            }
        } while (data != null);
        return dataList;
    }
    @Override
    public ArticleMetaData cutArtData(HtmlTxt txt) {
            ArticleMetaData meta = new ArticleMetaData();
            CutResult rez = cut(txt, ART_LINK_START, ART_LINK_END);
            if (!rez.isFound()) {
                return null;
            }
            meta.setLink(LINK_BEGINS_STR+ rez.getTarget()+LINK_END_STR);

            rez = cut(txt, ART_IMG_START, ART_IMG_END);
            meta.setImg(IMG_TAG_START+rez.getTarget()+IMG_TAG_END);

            rez = cut(txt, BEGIN_TITLE, END_TITLE);
            meta.setTitle(ART_STR_TAG + rez.getTarget()+ART_STR_END_TAG);
//        rez= cut(txt, COM_ART_BEGIN, COM_ART_END);
            return meta;
        }
    @Override
    public CutResult cut(HtmlTxt txt, String begin, String end) {
        // Begin
        if (getBeginIndx(txt, begin)) return new CutResult(false);

        // End
        int endInd = txt.getTxt().indexOf(end);

        // Target
        return finalCutResult(txt, endInd);
    }
    private CutResult finalCutResult(HtmlTxt txt, int endInd) {
        CutResult result = new CutResult(true);
        result.setTarget(txt.getTxt().substring(0, endInd));

        txt.setTxt(txt.getTxt().substring(endInd));

        return result;
    }
    private boolean getBeginIndx(HtmlTxt txt, String begin) {
        int beginInd = txt.getTxt().indexOf(begin);
        if (beginInd < 0) {
            return true;
        }
        txt.setTxt(txt.getTxt().substring(beginInd + begin.length()));
        return false;
    }
}
