package parsetests;
import webzodziupaieska.data.NewsPapers;
import webzodziupaieska.functionality.NewsReader;

public class UnitTestForParse {

    public boolean checkingFinalRez() {
        NewsReader reader = new NewsReader();

        if (reader.generateWithContent(NewsPapers.DELFI) != null) {

            return true;
        }

        return false;
    }


}
