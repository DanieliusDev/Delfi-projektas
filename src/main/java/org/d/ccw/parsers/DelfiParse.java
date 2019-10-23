package org.d.ccw.parsers;

import org.d.ccw.data.ArticleMetaData;
import org.d.ccw.data.CutResult;
import org.d.ccw.data.HtmlTxt;


import java.util.ArrayList;
import java.util.List;

public class DelfiParse implements CCWParser {

//	public static final String ART_URL_START = "https://www.delfi.lt";

	public static final String ART_LINK_START = "headline-image\"><a class=\"img-link\" href=\"";
	public static final String ART_LINK_END = "\" ";

	public static final String ART_IMG_START = "data-src=\"";
	public static final String ART_IMG_END = "\" ";

	public static final String BEGIN_TITLE = "class=\"CBarticleTitle\" >";
	public static final String END_TITLE = "</a>";

//    public static final String COM_ART_BEGIN = "nbsp;<a href=\"https://www.delfi.lt";
//    public static final String COM_ART_END = "&amp;com=1";
	@Override
	public String targetPage() {
		return "https://www.delfi.lt";
	}

	@Override
	public List<ArticleMetaData> parseMetaData(String txt) {

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

	public ArticleMetaData cutArtData(HtmlTxt txt) {
		ArticleMetaData meta = new ArticleMetaData();
		CutResult rez = cut(txt, ART_LINK_START, ART_LINK_END);
		if (!rez.isFound()) {
			return null;
		}
		meta.setLink(rez.getTarget());

		rez = cut(txt, ART_IMG_START, ART_IMG_END);
		meta.setImg(rez.getTarget());

		rez = cut(txt, BEGIN_TITLE, END_TITLE);
		meta.setTitle(rez.getTarget());

//        rez= cut(txt, COM_ART_BEGIN, COM_ART_END);
		return meta;
	}

	public CutResult cut(HtmlTxt txt, String begin, String end) {

		// Begin
		int beginInd = txt.getTxt().indexOf(begin);
		if (beginInd < 0) {
			return new CutResult(false);
		}
		txt.setTxt(txt.getTxt().substring(beginInd + begin.length()));

		// End
		int endInd = txt.getTxt().indexOf(end);

		// Target
		CutResult result = new CutResult(true);
		result.setTarget(txt.getTxt().substring(0, endInd));

		txt.setTxt(txt.getTxt().substring(endInd));

		return result;
	}

//NewsReader read = new NewsReader();
//	@Override
//	public void parse() {
//		System.out.println(read.generateWithContent(NewsPapers.DELFI));
//	}
}
