package com.example.now;

public class List_Menu
{
    int image;
    String Name;

    public List_Menu(){ }
    public List_Menu(int image, String Name)
    {
        super();
        this.image = image;
        this.Name = Name;
    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
}
