package org.d.ccw.parsers;

import java.util.List;

import org.d.ccw.data.ArticleMetaData;

public interface  CCWParser {

	String targetPage();
	
     List<ArticleMetaData> parseMetaData(String txt);

}
