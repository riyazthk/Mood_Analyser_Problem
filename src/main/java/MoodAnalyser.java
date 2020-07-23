public class MoodAnalyser {
    public String message;

    public MoodAnalyser(String message){
    this.message=message;

}
    public String analyseMood()  {
        try {
            if (message.contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException e) {
              return "happy";
        }
    }
}