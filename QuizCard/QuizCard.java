package QuizCard;

public class QuizCard {

  private String q;
  private String a;
  public QuizCard(String q, String a) {
    this.q = q;
    this.a = a;
  }

  public String getQuestion() {
    return q;
  }

  public String getAnswer() {
    return a;
  }

}
