package org.d.ccw.data;

public class CutResult {

    private HtmlTxt txt;
    private String target;
    private boolean found=true;

    public CutResult() {
        this.found = false;
    }
    
    public CutResult(boolean found) {
        this.found = found;
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

	@Override
	public String toString() {
		return "Link: " + target;
	}


}
