package me.karunarathne.HashCode22;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name ;
    private int duration ;                  // in days
    private double score ;
    private int best_before ;               // in days
    List<Role> roles_for_contributors ;



    public Project (String name, int duration, double score, int best_before) {
        this.name = name;
        this.duration = duration;
        this.score = score;
        this.best_before = best_before;

        roles_for_contributors = new ArrayList<>() ;
    }

    private boolean addRole (Role role) {
        roles_for_contributors.add(role) ;
    }

    private boolean assignContributor (Contributor contributor, Role role) {
        for (Role r: roles_for_contributors) {
            if (r.equals(role)) {

            }
        }
    }
}
