package com.example.retrofit_fetchingjsonfromurl;

public class Model {

    private String name;
    private String realname;
    private String team;
    private String firstappearance;
    private String createby;
    private String publisher;
    private String imageurl;
    private String bio;


    public Model(String name, String realname,String team, String firstappearance, String createby, String publisher, String imageurl, String bio) {
        this.name = name;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createby = createby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRealname(){
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreateby() {
        return createby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }
}
