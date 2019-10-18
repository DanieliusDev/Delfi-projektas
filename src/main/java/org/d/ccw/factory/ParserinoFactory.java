package org.d.ccw.factory;

import org.d.ccw.data.NewsPapers;
import org.d.ccw.parsers.DelfiParse;
import org.d.ccw.parsers.LRytasParse;

public class ParserinoFactory {
    public Parserino getParserino(NewsPapers nameType) {
        if (nameType == null) {
            return null;
        }
        if (nameType.equals(NewsPapers.DELFI)) {
            return new DelfiParse();

        } else if (nameType.equals(NewsPapers.LRYTAS)) {
            return new LRytasParse();
        }

        return null;
    }
}