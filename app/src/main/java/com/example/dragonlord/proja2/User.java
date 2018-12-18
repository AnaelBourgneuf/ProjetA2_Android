package com.example.dragonlord.proja2;


public class User {
    private Integer id;
    private String lastname;
    private String firstname;
    private String alias;
    private String birth;
    private String mail;
    private Boolean isAdmin;
    private Promo promo;

    //--------------------------------

    //constructeur
    public User(){

    }

    public User(String lastname, String firstname, String alias, String birth, String mail, Boolean isAdmin, Promo promo){
        this.lastname = lastname;
        this.firstname = firstname;
        this.alias = alias;
        this.birth = birth;
        this.mail = mail;
        this.isAdmin = isAdmin;
        this.promo = promo;
    }

    public User(Integer id,String lastname, String firstname, String alias, String birth, String mail, Boolean isAdmin, Promo promo){
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.alias = alias;
        this.birth = birth;
        this.mail = mail;
        this.isAdmin = isAdmin;
        this.promo = promo;
    }

    //--------------------------------

    // getter lastname
    public String getLastname(){
        return this.lastname;
    }
    // setter lastname
    public void setlastname(String lastname){
        this.lastname = lastname;
    }

    //---------------

     //getter firstname
    public String getFirstname(){
        return this.firstname;
    }
    //setter firstname
    public void setfirstname(String firstname){
        this.firstname=firstname;
    }

    //---------------

    //getter alias
    public String getAlias() {
        return alias;
    }

    //setter alias
    public void setAlias(String alias) {
        this.alias = alias;
    }

    //getter promo
    public Promo getPromo() {
        return promo;
    }

    //setter promo
    public void setPromo(Promo promo) {
        this.promo = promo;
    }
}
