package com.example.lost_found;

public class vendor1 {
    public String name,objName,date,phone;
    public vendor1() {
    }

    public vendor1(String name, String objName, String Date, String phone) {
        this.name=name;
        this.objName=objName;
        this.date=Date;
        this.phone=phone;

    }
    public String getName(){
        return name;
    }
    public String getObjName(){
        return objName;
    }
    public String getDate(){
        return date;
    }
    public String getPhone(){
        return phone;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setObjName(String objName)
    {
        this.objName=objName;
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }


}
