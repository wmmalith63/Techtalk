package com.microimage;

public class MobileFactory {
    public static Mobile getMobile(MobileType mobileType){
        if(mobileType == null){
            return null;
        }
        if(mobileType == MobileType.HIGH){
            return new Iphone();
        }
        if(mobileType == MobileType.MIDDLE){
            return new Samsung();
        }
        if(mobileType == MobileType.LOW){
            return new Oppoi();
        }
        return null;
    }
}
