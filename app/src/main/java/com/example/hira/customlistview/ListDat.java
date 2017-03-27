package com.example.hira.customlistview;

/**
 * Created by Hira on 22-Mar-17.
 */

public class ListDat {
    public String name = "";
    public String number = "";
    public String cicleText = "";
    public ListDat(String name, String number, String cicleText)
    {
        this.name=name;
        this.number=number;
        this.cicleText=cicleText;
    }

    public void setName(String name)
    {
        this.name =name;
    }
    public void setNumber(String number)
    {
        this.name =number;
    }
    public void setCicleText(String circleText)
    {
        this.cicleText=circleText;
    }
    public String getName()
    {
        return name;
    }
    public String getNumber()
    {
        return number;
    }
    public String getCicleText(){return cicleText; }
}
