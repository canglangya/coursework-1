private static final int NUM_ASSESSMENTS = 3;
private static final int[] WEIGHTS = {30, 40, 30};

public static int[] average_grades(int[][] grades) {
    int numStudents = grades.length;
    int[] averages = new int[numStudents];

    for (int i = 0; i < numStudents; i++) {
        int weightedSum = 0;
        for (int j = 0; j < NUM_ASSESSMENTS; j++) {
            weightedSum += grades[i][j] * WEIGHTS[j];
        }
        averages[i] = weightedSum / 100;
    }
    return averages;
}

int numStudents = 2; 
int[][] grades = {
    {51, 83, 28}, 
    {0, 38, 95}  };

int[] result = average_grades(grades);

System.out.println("Students' Weighted Average Grades :");
for (int grade : result) {
    System.out.print(grade + " ");
}
