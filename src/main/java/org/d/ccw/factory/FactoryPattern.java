package org.d.ccw.factory;

import org.d.ccw.data.NewsPapers;

public class FactoryPattern {


    public static void main(String[] args) {
        ParserinoFactory parserinoFactory = new ParserinoFactory();


        Parserino parserino1 = parserinoFactory.getParserino(NewsPapers.DELFI);
        parserino1.parse();

        Parserino parserino2 = parserinoFactory.getParserino(NewsPapers.LRYTAS);
        parserino2.parse();
    }

}
