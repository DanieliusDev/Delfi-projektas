package org.d.ccw.producer;

import org.d.ccw.data.ArticleMetaData;

import java.util.List;

public class CristalClearHtml {
    public static final String LINK_BEGINS_STR = "<a href=";
    public static final String LINK_END_STR = ">Nuoroda i straipsni</a></p>";
    public static final String ART_STR_TAG = "<p>";
    public static final String ART_STR_END_TAG = "</p>";
    public static final String IMG_TAG_START = "<img src=";
    public static final String IMG_TAG_END = "></a>";
//
//    public String tagsAdded () {
//        ArticleMetaData amd = new ArticleMetaData();
//        String setLinkAndTags = LINK_BEGINS_STR + amd.getLink() + LINK_END_STR;
//        String setImgAndTags = IMG_TAG_START + amd.getImg()+IMG_TAG_END;
//        String setArticleAndTags = ART_STR_TAG + amd.getTitle() + ART_STR_END_TAG;
//
//        return "";
//    }
    
    public String makeCCWHtml(List<ArticleMetaData> art) {
    		
    	String newHtml = "<html><title>Cristal Clear Web :)</title><body>";
    	for (ArticleMetaData a : art) {
    		newHtml += ART_STR_TAG;
    		newHtml += IMG_TAG_START +  a.getImg() + IMG_TAG_END;
    		newHtml += "<h2>" +  a.getTitle() + "</h2>";
    		newHtml += LINK_BEGINS_STR +  a.getLink() + LINK_END_STR;
    		newHtml += ART_STR_END_TAG;
		}
    	newHtml += "</body></html>";
    	
    	return newHtml;
    }
    
    

}
