package me.karunarathne.HashCode22;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private static final String [] SKILLS = {"HTML", "Python", "CSS", "C++"} ;
    private static int numOfContributors;
    private static int numOfProjects;

    private static List<Contributor> contributorList  = new ArrayList<>() ;
    private static List<Project> projectList = new ArrayList<>() ;

    // TODO
    private static void populate () {

    }

    private static void autoAssign () {
        for (Project project: projectList) {
            List <Role> roles = project.getRoles_for_contributors() ;

            for (Role role: roles) {
                role.setAssignedContributor( getBestContributor (role)) ;
            }
        }
    }

    private static Contributor getBestContributor(Role role) {
        String requiredSkill = role.getRequired_skill() ;
        int requiredLevel = role.getLevel() ;

        for (Contributor contributor: contributorList) {
            int contributorsSkillLevel = contributor.getSkillLevel(requiredSkill) ;

            // skill level of the contributor matches the required skill level
            if (contributorsSkillLevel >= requiredLevel) {
                // TODO
            }

            // need to be mentored
            else if (contributorsSkillLevel == requiredLevel - 1) {
                // TODO
            }
        }
    }

}
