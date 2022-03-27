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

    private static boolean isSkill (String word) {
        return Arrays.stream(SKILLS).anyMatch(word::equalsIgnoreCase) ;
    }

    private static void readFirstLine (String firstLine) {
        String [] con_proj = firstLine.split(" ") ;
        numOfContributors = Integer.parseInt(con_proj [0]) ;
        numOfProjects = Integer.parseInt(con_proj [1]) ;
    }
}
