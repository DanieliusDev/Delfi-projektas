package org.d.ccw;

import org.d.ccw.data.ArticleMetaData;
import org.d.ccw.data.NewsPapers;
import org.d.ccw.parsers.CCWParser;
import org.d.ccw.parsers.DelfiParse;
import org.d.ccw.parsers.LRytasParse;
import org.d.ccw.utils.HtmlGet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsReader {

	private Map<NewsPapers, CCWParser> parsers = new HashMap<>();
	private HtmlGet htmlGet = new HtmlGet();

	public NewsReader() {
		parsers.put(NewsPapers.DELFI, new DelfiParse());
		parsers.put(NewsPapers.LRYTAS, new LRytasParse());
	}

	public List<ArticleMetaData> extractMetaData(NewsPapers linkName) {
		return parsers.get(linkName).parseMetaData(htmlGet.readContent( parsers.get(linkName).targetPage()).toString());
	}

}