package webzodziupaieska.duomenys;

public class ArticleMetaData {

    private String img;
    private String title;
    private String link;
    private String diffLink;
    private String diffTitle;

    public String getDiffTitle() {
        return diffTitle;
    }

    public void setDiffTitle(String diffTitle) {
        this.diffTitle = diffTitle;
    }





    public String getDiffLink() {
        return diffLink;
    }

    public void setDiffLink(String diffLink) {
        this.diffLink = diffLink;
    }



//    public ArticleMetaData(String img, String title, String link) {
//        this.img = img;
//        this.title = title;
//        this.link = link;
//    }



    public void setImg(String img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "ArticleMetaData{" +
                "\nimg=" + img +
                "\ntitle=" + title  +
                "\nlink=" + link  +
//                "\nLink2=" + diffLink+
//                "\nTITLE2="+ diffTitle+
                '}';
    }
}
