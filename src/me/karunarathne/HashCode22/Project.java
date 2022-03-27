package me.karunarathne.HashCode22;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class Project {
    private final String name ;
    private final int duration ;                  // in days
    private final double score ;
    private final int best_before ;               // in days

    List<Role> roles_for_contributors ;

    public Project (String name, int duration, double score, int best_before) {
        this.name = name;
        this.duration = duration;
        this.score = score;
        this.best_before = best_before;

        roles_for_contributors = new ArrayList<>() ;
    }

    private boolean addRole (Role role) {
        return roles_for_contributors.add(role) ;
    }

    public void addRole(String input) {
        String [] elements = input.split(" ") ;
        Role role = new Role(elements [0].toUpperCase(Locale.ROOT) , Integer.parseInt(elements[1])) ;

        roles_for_contributors.add(role) ;
    }
}
