package webzodziupaieska;

import webzodziupaieska.duomenys.ArticleMetaData;
import webzodziupaieska.funkcionalumas.PaieskaPagalUzklausa;

import java.util.List;

public class Main {
    public static final String txt1 = "</div></div>\n" +
            "</div><div class=\"container bb2\" id=\"toc-sportas\" data-side-menu data-title=\"Sportas\">\n" +
            " <div class=\"row\">\n" +
            "  <div class=\"dwidget\" id=\"dwidget_12975\" style=\"width:1200px;height:250px;display:block;overflow:hidden\"></div><script type=\"text/javascript\">dwidget.load(12975,1)</script> </div>\n" +
            " <div class=\"row\">\n" +
            "  <div class=\"col-xs-9 left\"><div class=\"category-header category-903 \" ><h2 class=\"pull-left\"><a href=\"https://www.delfi.lt/sportas/\">Sportas</a></h2><nav class=\"pull-right\"><ul class=\"nav\"><li><a href=\"https://www.delfi.lt/sportas/krepsinis/\">Krepšinis</a></li><li><a href=\"https://www.delfi.lt/sportas/futbolas/\">Futbolas</a></li><li><a href=\"https://www.delfi.lt/sportas/f1/\">F-1</a></li><li><a href=\"https://www.delfi.lt/auto/automobiliu-sportas/\">Auto ir motosportas</a></li><li><a href=\"https://www.delfi.lt/sportas/kitos-sporto-sakos/\">Kitos sporto šakos</a></li><li><a href=\"https://www.delfi.lt/sportas/tenisas/\">Tenisas</a></li><li><a href=\"https://www.delfi.lt/sportas/lteam/\">LTeam</a></li></ul></nav><div class=\"clearfix\"></div></div><div class=\"row\"><div class=\"col-xs-6\"><div class=\"headline\" ><div class=\"headline-image\"><a class=\"img-link\" href=\"https://www.delfi.lt/sportas/tenisas/berankis-kremliaus-taureje-suklupo-jau-pirmame-rate.d?id=82522293\" ><img class=\"img-responsive lazy\" data-src=\"https://g4.dcdn.lt/images/pix/430x260/9QCCC6mFIIM/ricardas-berankis-82109541.jpg\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAPr6+gAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"430\" height=\"260\" alt=\"\" style=\"width: 430px; height: 260px\"/>\n" +
            "\n" +
            "</a></div><h3 class=\"headline-title\"><a href=\"https://www.delfi.lt/sportas/tenisas/berankis-kremliaus-taureje-suklupo-jau-pirmame-rate.d?id=82522293\" class=\"CBarticleTitle\" >Berankis Kremliaus taurėje suklupo jau pirmame rate</a>&nbsp;<a href=\"https://www.delfi.lt/sportas/tenisas/berankis-kremliaus-taureje-suklupo-jau-pirmame-rate.d?id=82522293&amp;com=1\" class=\"commentCount\" rel=\"nofollow\">(9)</a>\n" +
            "\t\t\t\t</h3></div></div><div class=\"col-xs-6\"><div class=\"headline\" ><div class=\"headline-image\"><a class=\"img-link\" href=\"https://www.delfi.lt/sportas/kitos-sporto-sakos/europos-dviraciu-treko-cempionate-sesi-lietuvos-atstovai.d?id=82520767\" ><img class=\"img-responsive lazy\" data-src=\"https://g1.dcdn.lt/images/pix/430x260/xkR9VxkkJ-g/simona-krupeckaite-81589977.jpg\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAPr6+gAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"430\" height=\"260\" alt=\"\" style=\"width: 430px; height: 260px\"/>\n" +
            "\n" +
            "</a></div><h3 class=\"headline-title\"><a href=\"https://www.delfi.lt/sportas/kitos-sporto-sakos/europos-dviraciu-treko-cempionate-sesi-lietuvos-atstovai.d?id=82520767\" class=\"CBarticleTitle\" >Europos dviračių treko čempionate – šeši Lietuvos atstovai</a>\n" +
            "\t\t\t\t</h3></div></div></div><div class=\"row\"><div class=\"col-xs-4\"><div class=\"headline\" ><div class=\"headline-image\"><a class=\"img-link\" href=\"https://www.delfi.lt/sportas/kitos-sporto-sakos/pagaliau-gruodi-kavaliauskas-kovos-del-pasaulio-cempiono-dirzo.d?id=82520431\" ><img class=\"img-responsive lazy\" data-src=\"https://g3.dcdn.lt/images/pix/280x170/K1R3pRrb7uw/egidijus-kavaliauskas-82520635.jpg\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAPr6+gAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"280\" height=\"170\" alt=\"\" style=\"width: 280px; height: 170px\"/>\n" +
            "\n" +
            "</a></div><h3 class=\"headline-title\"><a href=\"https://www.delfi.lt/sportas/kitos-sporto-sakos/pagaliau-gruodi-kavaliauskas-kovos-del-pasaulio-cempiono-dirzo.d?id=82520431\" class=\"CBarticleTitle\" >Pagaliau: gruodį Kavaliauskas kovos dėl pasaulio čempiono diržo</a>&nbsp;<a href=\"https://www.delfi.lt/sportas/kitos-sporto-sakos/pagaliau-gruodi-kavaliauskas-kovos-del-pasaulio-cempiono-dirzo.d?id=82520431&amp;com=1\" class=\"commentCount\" rel=\"nofollow\">(6)</a>\n" +
            "\t\t\t\t</h3></div></div><div class=\"col-xs-4\"><div class=\"headline\" ><div class=\"headline-image\"><a class=\"img-link\" href=\"https://www.delfi.lt/sportas/futbolas/chuliganizmas-tribunose-del-rasizmo-rungtynes-tarp-bulgarijos-ir-anglijos-buvo-sustabdytos-du-kartus.d?id=82519007\" ><img class=\"img-responsive lazy\" data-src=\"https://g3.dcdn.lt/images/pix/280x170/oyFZtVTkUq8/rasistiniai-ispuoliai-bulgarijoje-82519265.jpg\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAPr6+gAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"280\" height=\"170\" alt=\"\" style=\"width: 280px; height: 170px\"/><div class=\"headline-icons\"><i class=\"fa fa-play\" aria-hidden=\"true\"></i></div>";
    public static void main(String[] args) {
        PaieskaPagalUzklausa ppu = new PaieskaPagalUzklausa();
        List<ArticleMetaData> p= ppu.extractMetaData(txt1);
        System.out.println(p);
    }
}
