package me.karunarathne.HashCode22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadInput {
    private static final String [] SKILLS = {"HTML", "Python", "CSS", "C++"} ;
    private static int numOfContributors;
    private static int numOfProjects;

    private static List<Contributor> contributorList  = new ArrayList<>() ;
    private static List<Project> projectList = new ArrayList<>() ;

    private static void readContributors (String contributorsInfo) {
        String [] contributor_info_arr = contributorsInfo.split("\n" ) ;

        for (int i=0; i<contributor_info_arr.length; ) {
            String [] elements = contributor_info_arr[i].split(" ") ;
            Contributor currentContributor = new Contributor(elements[0]) ;

            for (int j=1; j<Integer.parseInt(elements[1])+1 ; j++) {
                currentContributor.addSkill ( contributor_info_arr [i+j].split(" ")) ;
            }
            i += Integer.parseInt(elements[1])+1 ;

            contributorList.add(currentContributor) ;
        }
    }

    private static void readProjects (String projectsInfo) {
        String [] project_info_arr = projectsInfo.split("\n" ) ;

        for (int i=0; i<project_info_arr.length; ) {
            String [] elements = project_info_arr [i].split(" ") ;
            Project currentProject = new Project (
                    elements [0],                           // name
                    Integer.parseInt(elements [1]),         // duration
                    Integer.parseInt(elements [2]),         // score
                    Integer.parseInt(elements [3])           // best before
            ) ;

            for (int j=1; j<Integer.parseInt(elements[4])+1 ; j++) {
                currentProject.addRole (
                        project_info_arr [i+j]
                ) ;
            }
            i += Integer.parseInt(elements[4])+1 ;

            projectList.add (currentProject) ;
        }
    }

    private static boolean isSkill (String word) {
        return Arrays.stream(SKILLS).anyMatch(word::equalsIgnoreCase) ;
    }

    private static void readFirstLine (String firstLine) {
        String [] con_proj = firstLine.split(" ") ;
        numOfContributors = Integer.parseInt(con_proj [0]) ;
        numOfProjects = Integer.parseInt(con_proj [1]) ;
    }
}
