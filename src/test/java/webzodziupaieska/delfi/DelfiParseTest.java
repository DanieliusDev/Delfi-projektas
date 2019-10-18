package webzodziupaieska.delfi;

import org.d.ccw.NewsReader;
import org.d.ccw.data.NewsPapers;
import org.junit.Test;

class DelfiParseTest {
    @Test
    public void checkingFinalRez() {
        NewsReader reader = new NewsReader();

String availablePage =reader.generateWithContent(NewsPapers.BBC);
//Assert.assertEquals(NewsPapers.DELFI,availablePage.());


    }
}