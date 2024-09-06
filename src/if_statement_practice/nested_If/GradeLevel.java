package if_statement_practice.nested_If;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeLevel =15;
        String result;

        if(gradeLevel>=1 && gradeLevel>=5){
            result="Elementary school";
        } else if (gradeLevel <=6 && gradeLevel >=8) {
            result="Middle school";
        } else if (gradeLevel <= 9 &&gradeLevel >=12) {
            result="High school";
        } else if (gradeLevel<=13 &&gradeLevel>=16) {
            result="College";
        } else if (gradeLevel <= 17 &&gradeLevel>= 18) {
            result="Grad school";
        }else {
            result = "Invalid grade level given";
        }

            System.out.println(result);
        }

    }
    /*
    Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
         grade level and types are:
                 1-5: Elementary school
                 6-8: Middle school
                 9-12: High school
                 13-16: College
                 17-18: Grad School
                 For Any Other grade: Invalid grade level given

                 NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */

