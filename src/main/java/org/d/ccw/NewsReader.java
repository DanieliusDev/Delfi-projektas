package org.d.ccw;

import org.d.ccw.data.ArticleMetaData;
import org.d.ccw.data.NewsPapers;
import org.d.ccw.factory.Parserino;
import org.d.ccw.factory.ParserinoFactory;
import org.d.ccw.parsers.CCWParser;
import org.d.ccw.parsers.DelfiParse;
import org.d.ccw.parsers.LRytasParse;
import org.d.ccw.utils.HtmlGet;

import java.util.List;

public class NewsReader {

//    public String callNews (NewsPapers name) {
//
//        if (NewsPapers.DELFI!=null) {
//            System.out.println(generateWithContent(NewsPapers.DELFI));
//        }
//        if (NewsPapers.LRYTAS!=null) {
//            System.out.println(generateWithContent(NewsPapers.LRYTAS));
//        }
//        if (NewsPapers.BBC!=null) {
//            System.out.println(generateWithContent(NewsPapers.BBC));
//        }
//
//        return "Nothing selected";
//    }

	public String generateWithContent(NewsPapers linkName) {
		DelfiParse delfiObj = new DelfiParse();
		LRytasParse rytasObj = new LRytasParse();
		HtmlGet readerObj = new HtmlGet();

		ParserinoFactory parFac = new ParserinoFactory();
		Parserino delfi1 = parFac.getParserino(NewsPapers.DELFI);


		List<ArticleMetaData> delfi = getListOfData(delfiObj, readerObj);
		List<ArticleMetaData> lrytas = getListOfData(rytasObj, readerObj);

		for (ArticleMetaData strs : delfi) {

			switch (linkName) {
			case DELFI:
				System.out.println(strs.toString());
				System.out.println();
				break;
			case LRYTAS:
				System.out.println();
				System.out.println("");
				break;
			case BBC:
				System.out.println("BBC");
				break;
			default:
				return "Page not valid";
			}
		}
		return "";
	}

	private List<ArticleMetaData> getListOfData(CCWParser di, HtmlGet skaito) {
		return di.parseMetaData(skaito.readContent(di.targetPage()).toString());
	}

	
}