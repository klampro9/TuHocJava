package BtLab7;

public class SinhVienIT extends Sinhvien {
    private double scoreJava;
    private double scorHTML;

    public SinhVienIT(double scorHTML, double scoreJava) {
        this.scorHTML = scorHTML;
        this.scoreJava = scoreJava;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScorHTML() {
        return scorHTML;
    }

    public void setScorHTML(double scorHTML) {
        this.scorHTML = scorHTML;
    }

    @Override
    double getDiem() {
        // TODO Auto-generated method stub
        return (this.scoreJava *2 + this.scorHTML) /3;
    }
    
}