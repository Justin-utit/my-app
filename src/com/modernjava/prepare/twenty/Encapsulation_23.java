package com.modernjava.prepare.twenty;
/*
    Java物件導向 有三個大觀念，這三大觀察念的主要目的，是讓程式更加的有序、乾淨(減少重複)、有邏輯
    1 封裝 <-- Encapsulation
    2 繼承
    3 多型
    介面 與 抽象類別 也是在強化相同的目的，不過這個下次再說

    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
    To achieve this, you must:
    declare class variables/attributes as private
    provide public get and set methods to access and update the value of a private variable

    (重要)
    private variables can only be accessed within the same class (an outside class has no access to it).
    However, it is possible to access them if we provide public get and set methods.
    The get method returns the variable value, and the set method sets the value.

    Better control of class attributes and methods
    Class attributes can be made read-only (if you only use the get method),
    or write-only (if you only use the set method)
    Increased security of data (set checkpoint in getter and setter)
 */
public class Encapsulation_23 {

    private String name = "xxx"; // private = restricted access

    // Getter
    // read only
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        // The this keyword is used to refer to the current object.
        this.name = newName;
    }


}



























