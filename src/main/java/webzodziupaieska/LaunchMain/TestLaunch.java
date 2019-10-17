package webzodziupaieska.LaunchMain;

import webzodziupaieska.data.NewsPapers;
import webzodziupaieska.functionality.NewsReader;

public class TestLaunch {
    public static void main(String[] args) {
        NewsReader nrd = new NewsReader();
        System.out.println(nrd.generateWithContent(NewsPapers.DELFI));
    }
}
