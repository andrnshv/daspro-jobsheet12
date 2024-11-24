public class assignment06 {
    public static void main(String[] args) {
        // Create 2D array [10 respondents][6 questions]
        int[][] surveyData = {
            {4, 5, 3, 4, 5, 3},
            {3, 4, 3, 3, 4, 3},
            {5, 4, 5, 4, 5, 4},
            {4, 4, 4, 4, 4, 4},
            {3, 3, 3, 3, 3, 3},
            {4, 5, 4, 5, 4, 5},
            {5, 4, 5, 4, 5, 4},
            {4, 3, 4, 3, 4, 3},
            {5, 5, 5, 5, 5, 5},
            {4, 4, 4, 4, 4, 4}
        };

        // 1. Display survey results
        System.out.println("1. Survey Results:");
        System.out.println("   Q1  Q2  Q3  Q4  Q5  Q6");
        for (int i = 0; i < surveyData.length; i++) {
            System.out.print("R" + (i+1) + " ");
            for (int j = 0; j < surveyData[i].length; j++) {
                System.out.print(surveyData[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

        // 2. Average for each respondent
        System.out.println("2. Average per Respondent:");
        for (int i = 0; i < surveyData.length; i++) {
            double sum = 0;
            for (int j = 0; j < surveyData[i].length; j++) {
                sum += surveyData[i][j];
            }
            double average = sum / surveyData[i].length;
            System.out.printf("Respondent %d: %.2f%n", (i+1), average);
        }
        System.out.println();

        // 3. Average for each question
        System.out.println("3. Average per Question:");
        for (int j = 0; j < surveyData[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < surveyData.length; i++) {
                sum += surveyData[i][j];
            }
            double average = sum / surveyData.length;
            System.out.printf("Question %d: %.2f%n", (j+1), average);
        }
        System.out.println();

        // 4. Overall average
        double totalSum = 0;
        int totalElements = surveyData.length * surveyData[0].length;
        for (int i = 0; i < surveyData.length; i++) {
            for (int j = 0; j < surveyData[i].length; j++) {
                totalSum += surveyData[i][j];
            }
        }
        double overallAverage = totalSum / totalElements;
        System.out.printf("4. Overall Average: %.2f%n", overallAverage);
    }
}
