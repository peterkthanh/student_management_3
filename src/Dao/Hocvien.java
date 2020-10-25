/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Hocvien implements Serializable {
    
    private String maHS;
    private String maHoSo;
    private String maLop;
    private String maKQ;
    private String maHL;
    private String maHK;
    private double diemTBCN = -1.0;

    @Override
    public String toString() {
        return this.toString();
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getMaHoSo() {
        return maHoSo;
    }

    public void setMaHoSo(String maHoSo) {
        this.maHoSo = maHoSo;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaKQ() {
        return maKQ;
    }

    public void setMaKQ(String maKQ) {
        this.maKQ = maKQ;
    }

    public String getMaHL() {
        return maHL;
    }

    public void setMaHL(String maHL) {
        this.maHL = maHL;
    }

    public String getMaHK() {
        return maHK;
    }

    public void setMaHK(String maHK) {
        this.maHK = maHK;
    }

    public double getDiemTBCN() {
        return diemTBCN;
    }

    public void setDiemTBCN(double diemTBCN) {
        this.diemTBCN = diemTBCN;
    }
    

}
