package com.company;

public class Box <J>{
    private J var;


    public Box(J var) {
        this.var = var;

    }

    public J getVar() {
        return var;
    }

    public void setVar(J var) {
        this.var = var;
    }


    public  static <J> Object genericMethod(J var){
         return genericMethod(var);
     }


    @Override
    public String toString() {
        return "Box{" +
                "var=" + var ;
    }
}
