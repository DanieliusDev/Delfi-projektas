package webzodziupaieska.functionality;

public class addTags {
    public static final String LINK_BEGINS_STR = "<a href=";
    public static final String LINK_END_STR = ">Nuoroda i straipsni</a></p>";
    public static final String ART_STR_TAG = "<p>";
    public static final String ART_STR_END_TAG = "</p>";
    public static final String IMG_TAG_START = "<img src=";
    public static final String IMG_TAG_END = "></a>";

    public String tagsAdded () {
        ArticleMetaData amd = new ArticleMetaData();
        String setLinkAndTags = LINK_BEGINS_STR + amd.getLink() + LINK_END_STR;
        String setImgAndTags = IMG_TAG_START + amd.getImg()+IMG_TAG_END;
        String setArticleAndTags = ART_STR_TAG + amd.getTitle() + ART_STR_END_TAG;

        return "";
    }

}
