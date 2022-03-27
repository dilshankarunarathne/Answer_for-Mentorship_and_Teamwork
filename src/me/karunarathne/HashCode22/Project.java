package me.karunarathne.HashCode22;

import java.util.List;

public class Project {
    private String name ;
    private int duration ;                  // in days
    private double score ;
    private int best_before ;               // in days
    List<Role> roles_for_contributors ;

    public Project (String name, int duration, double score, int best_before,
                    List<Role> roles_for_contributors) {
        this.name = name;
        this.duration = duration;
        this.score = score;
        this.best_before = best_before;
        this.roles_for_contributors = roles_for_contributors;
    }

    public boolean assignContributor (Contributor contributor, Role role) {
        if (!roles_for_contributors.contains(role)) return false ;



        return false ;
    }
}
