package com.example.hilman.cobalib;

public class ClassDiCobain {
    String hasil;
    int i,x;
    public ClassDiCobain(int i,int x){
        this.i = i;
        this.x = x;
    }
    public String GetHasilCobain(){
        return String.valueOf(i+x);
    }
}
