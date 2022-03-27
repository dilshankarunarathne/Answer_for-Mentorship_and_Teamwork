package me.karunarathne.HashCode22;

import java.util.Locale;

public class Contributor {
    private String name ;

    private int htmlSkill ;
    private int pythonSkill ;
    private int cssSkill ;
    private int cppSkill ;

    public Contributor(String name) {
        this.name = name ;

        htmlSkill = 0 ;
        cppSkill = 0 ;
        cssSkill = 0 ;
        pythonSkill= 0 ;
    }

    public boolean addSkill (String[] skillInfo) {
        switch (skillInfo [0].toUpperCase(Locale.ROOT)) {
            case ("HTML") :
                htmlSkill = Integer.parseInt(skillInfo [1]) ;
                return true ;
            case ("C++") :
                cppSkill = Integer.parseInt(skillInfo [1]) ;
                return true ;
            case ("CSS") :
                cssSkill = Integer.parseInt(skillInfo [1]) ;
                return true ;
            case ("PYTHON") :
                pythonSkill = Integer.parseInt(skillInfo [1]) ;
                return true ;
            default:
                return false ;
        }
    }
}
