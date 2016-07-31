package ru.dimcher.part002.models;

public class CommentsEncap extends ItemEncap {
    public String comm;
    public CommentsEncap(String name,String desc,String comments){
        this.name = name;
        this.description = desc;
        this.comm = comments;
    }
    public String getComm(){return this.comm;}
}
