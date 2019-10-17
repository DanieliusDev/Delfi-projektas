package webzodziupaieska.funkcionalumas;

import webzodziupaieska.ReaderDaikts;
import webzodziupaieska.duomenys.ArticleMetaData;

import java.util.List;

public class Launchas {
    public static void main(String[] args) {

        PaieskaPagalUzklausa ppu = new PaieskaPagalUzklausa();
        List<ArticleMetaData> visiStraipsniai = ppu.extractMetaData(new ReaderDaikts().readContent("https://www.delfi.lt").toString());
//        for (ArticleMetaData data : visiStraipsniai) {
//
//            System.out.println(" <p> "+data.getTitle()+"</p>");
//            System.out.println("<p><img  src = \n" + "\"  "+data.getImg() +"\" width=\"430\" height=\"230\" alt=\"\"\n" + "/> </p>");
//            System.out.println("<p>\n" + "<a href="+data.getLink()+"\"\n" + ">link</a>\n" + "</p>");
//            System.out.println("");
//            System.out.println("kitokie titlai "+" <a href=\""+data.getDiffTitle()+"\" >link</a>\n" +
//                    "</p>");
//            System.out.println("");
//        }
        for (ArticleMetaData data : visiStraipsniai) {

            System.out.println(data);
            System.out.println();

        }


    }
}
