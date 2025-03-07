/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nhat Lam
 */
public class Con_Cho {
    public String Ten_Loai_Cho;
    public String Mau_Long;
    public int Tuoi;
    public Con_Cho(String Ten_Loai_Cho, String Mau_Long, int Tuoi){
        this.Ten_Loai_Cho = Ten_Loai_Cho;
        this.Mau_Long = Mau_Long;
        this.Tuoi = Tuoi;
    }
    public Con_Cho(){
        this.Ten_Loai_Cho = "unknow";
        this.Mau_Long = "unknow";
        this.Tuoi = 0;
    }
    public void Sua(){
        System.out.println("Gau Gau");
    }
}
