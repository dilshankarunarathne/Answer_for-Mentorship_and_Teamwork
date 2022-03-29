package me.karunarathne.HashCode22;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private static final String [] SKILLS = {"HTML", "Python", "CSS", "C++"} ;

    private static int numberOfContributors;
    private static int numberOfProjects;

    private static Contributor [] contributorList  = new Contributor [numberOfContributors] ;
    private static Project [] projectList = new Project [numberOfProjects] ;

    // TODO
    private static void populate () {

    }

    private static void autoAssign () {
        for (Project project: projectList) {
            Role [] roles = project.getRoles_for_contributors() ;

            for (Role role: roles) {
                String requiredSkill = role.getRequired_skill() ;
                int requiredLevel = role.getLevel() ;

                for (Contributor contributor: contributorList) {
                    int contributorsSkillLevel = contributor.getSkillLevel(requiredSkill) ;

                    // skill level of the contributor matches the required skill level
                    if (contributorsSkillLevel > requiredLevel) {
                        // TODO
                    }

                    // need to be mentored
                    else if (contributorsSkillLevel == requiredLevel - 1) {
                        // TODO
                    }
                }
            }
        }
    }

    private static int calculateTotalDays () {
        int days = 0 ;
        for (Project project: projectList) {
            days += project.roles_for_contributors.length * project.getDuration() ;
        }
        return days ;
    }

}
