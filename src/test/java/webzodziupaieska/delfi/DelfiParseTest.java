package webzodziupaieska.delfi;

import org.junit.Test;
import webzodziupaieska.data.NewsPapers;
import webzodziupaieska.functionality.NewsReader;

class DelfiParseTest {
    @Test
    public void checkingFinalRez() {
        NewsReader reader = new NewsReader();

String availablePage =reader.generateWithContent(NewsPapers.BBC);
//Assert.assertEquals(NewsPapers.DELFI,availablePage.());


    }
}