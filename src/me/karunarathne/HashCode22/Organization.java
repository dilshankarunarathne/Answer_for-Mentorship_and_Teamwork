package me.karunarathne.HashCode22;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private static final String [] SKILLS = {"HTML", "Python", "CSS", "C++"} ;

    private static int numberOfContributors;
    private static int numberOfProjects;

    private static Contributor [] contributorList  = new Contributor [numberOfContributors] ;
    private static Project [] projectList = new Project [numberOfProjects] ;

    private static void assign () {
        for (Contributor c: contributorList) {

        }
    }

    private static int calculateTotalDays () {
        int totalDays = 0 ;
        for (Project p: projectList) {
            totalDays += p.getDuration() ;
        }
        return totalDays ;
    }

    // TODO
    private static void populate () {

    }

    private static void autoAssign () {
        for (Project project: projectList) {
            Role [] roles = project.getRoles_for_contributors() ;

            boolean [] taken = new boolean[contributorList.length] ;

            for (Role role: roles) {
                String requiredSkill = role.getRequired_skill() ;
                int requiredLevel = role.getLevel() ;

                for (int i=0; i<contributorList.length; i++) {
                    int contributorsSkillLevel = contributorList [i].getSkillLevel(requiredSkill) ;

                    // not applicable
                    if (contributorsSkillLevel < requiredLevel-1) continue ;
                    if (taken [i] == true) continue ;

                    // skill level of the contributor matches the required skill level
                    // level up
                    if (contributorsSkillLevel == requiredLevel) {
                        role.assignContributor (contributorList [i]);
                        taken [i] = true ;
                    }

                    // Can work
                    else if (contributorsSkillLevel > requiredLevel) {
                        role.assignContributor (contributorList [i]);
                        taken [i] = true ;
                    }

                    // need to be mentored
                    else if (contributorsSkillLevel == requiredLevel - 1) {
                        role.assignContributor (contributorList [i]);
                        taken [i] = true ;
                    }

                }
            }
        }
    }

}
