public class MoodAnalyser {

    public String analyseMood(String message) {
        if(message.contains("happy")){
            return "happy";
        }else{
            return "sad";
        }
    }
}