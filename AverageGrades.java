import java.util.Arrays;

public class AverageGrades {
    static int[] average_grades(int [][] grades, int[] weights){
        int[] result = new int [grades.length]; // creates and array 
        for(int i = 0; i < grades.length; i++){
            int total = 0; // sets total to 0 for each student
            for(int x = 0; x < weights.length; x++) {
                total = total + (grades[i][x] *weights[x]); //calculates the weighted average of the students 

            }
            result[i] = total / 100; //works put the percentage 
        }
        return result;
    }
    public static void main(String[] args) {
       int[] result = average_grades(new int[][]{{51, 83, 28}, {0, 38, 95}},new int[]{30, 40, 30});
       System.out.print("int["+result.length+"]");
       System.out.println(Arrays.toString(result));
    }
        
    
}
