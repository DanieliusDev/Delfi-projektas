package org.d.ccw.parsers;

import org.d.ccw.NewsReader;
import org.d.ccw.data.ArticleMetaData;
import org.d.ccw.data.NewsPapers;
import org.d.ccw.factory.Parserino;

import java.util.ArrayList;
import java.util.List;

public class LRytasParse implements CCWParser {

    @Override
    public String targetPage() {

        return "";
    }

    @Override
    public List<ArticleMetaData> parseMetaData(String txt) {

        return new ArrayList<ArticleMetaData>();
    }

//    @Override
//    public void parse() {
//        System.out.println(read.generateWithContent(NewsPapers.LRYTAS));
//    }
}
