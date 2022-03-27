package me.karunarathne.HashCode22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadInput {
    private static final String [] SKILLS = {"HTML", "Python", "CSS", "C++"} ;
    private static int numOfContributors;
    private static int numOfProjects;

    private static List<Contributor> contributorList  = new ArrayList<>() ;

    private static void readContributors (String contributorsInfo) {
        String [] contributor_info_arr = contributorsInfo.split("\n" ) ;

        for (int i=0; i<contributor_info_arr.length; i++) {
            String [] elements = contributor_info_arr[i].split(" ") ;
            Contributor currentContributor ;

            // checking if it's a name
            if (! isSkill (elements [0])) {
                currentContributor = new Contributor(elements [0]) ;
                
            }
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
