import java.util.Scanner;

public class QuestionService {
        
    Question[] questions=new Question[5];

    public QuestionService() {
        questions[0]=new Question(1,"What is the capital of India?","Mumbai","Delhi","Kolkata","Chennai","Delhi");
        questions[1]=new Question(2,"What is the capital of Australia?","Sydney","Melbourne","Canberra","Perth","Canberra");
        questions[2]=new Question(3,"What is the capital of USA?","New York","Washington D.C.","Los Angeles","Chicago","Washington D.C.");
        questions[3]=new Question(4,"What is the capital of UK?","Manchester","Birmingham","London","Liverpool","London");
        questions[4]=new Question(5,"What is the capital of Japan?","Tokyo","Osaka","Kyoto","Hiroshima","Tokyo");
    }

    public void playQuiz(){
        int score=0;
        for(int i=0;i<5;i++){
            System.out.println(questions[i].getQuestion());
            System.out.println("A. "+questions[i].getOpt1());
            System.out.println("B. "+questions[i].getOpt2());
            System.out.println("C. "+questions[i].getOpt3());
            System.out.println("D. "+questions[i].getOpt4());
            System.out.println("Enter your answer");
            Scanner sc=new Scanner(System.in);
            String ans=sc.next();
            if(ans.equals(questions[i].getAnswer())){
                score++;
            }
        }
        System.out.println("Your score is "+score);

    }


}
