package webzodziupaieska.functionality;

public class ArticleMetaData {

    private String img;
    private String title;
    private String link;
    private String comm;

    public String getComm() {
        return comm;
    }
    public void setComm(String comm) {
        this.comm = comm;
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
        return    title +
                "\n" + link  +
                "\n" + img  ;
//                "\n Comments: " + comm;
    }
}
