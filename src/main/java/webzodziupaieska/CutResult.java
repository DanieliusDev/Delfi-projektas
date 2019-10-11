package webzodziupaieska;

public class CutResult {

    private HtmlTxt txt;
    private String target;
    private boolean found=true;

    public CutResult() {
        this.found = false;
    }

    public CutResult(HtmlTxt txt, String target) {
        this.txt = txt;
        this.target = target;
    }

    public boolean isFound() {
        return found;
    }

    public HtmlTxt getTxt() {
        return txt;
    }

    public void setTxt(HtmlTxt txt) {
        this.txt = txt;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }


}
