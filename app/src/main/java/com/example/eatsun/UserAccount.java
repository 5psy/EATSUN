package com.example.eatsun;

public class UserAccount {
    private String emailid;
    private String passwd;
    private String idtoken; //고유토큰정보

    public UserAccount(){

    }
    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIdtoken() {
        return idtoken;
    }

    public void setIdtoken(String idtoken) {
        this.idtoken = idtoken;
    }
}
