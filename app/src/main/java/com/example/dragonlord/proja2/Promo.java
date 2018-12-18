package com.example.dragonlord.proja2;

public class Promo {

    private Integer id;
    private String name;
    private String alias;

    public Promo(){

    }

    public Promo(String name, String alias){
        this.name=name;
        this.alias=alias;
    }

    public Promo(Integer id, String name, String alias){
        this.id=id;
        this.name=name;
        this.alias=alias;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }
}