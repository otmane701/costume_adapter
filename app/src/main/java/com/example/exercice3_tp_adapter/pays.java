package com.example.exercice3_tp_adapter;

public class pays {
    public int pays;
    public String monnaire;
    public String code;

    public pays(int pays,String monnaire,String code){
        this.pays=pays;
        this.monnaire=monnaire;
        this.code=code;
    }
    public int getPays(){
        return this.pays;
    }
    public String getMonnaire(){
        return this.monnaire;
    }
    public String getCode(){
        return this.code;
    }
    //seterse
    public void setPays(int pays){
        this.pays=pays;
    }
    public void setMonnaire(String monnaire){
        this.monnaire=monnaire;
    }
    public void setCode(String code){
        this.code=code;
    }
}
