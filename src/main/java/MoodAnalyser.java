public class MoodAnalyser {
    public String message;

    public MoodAnalyser(String message){
        this.message=message;

    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"please enter proper message");
            if (message.contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"please enter proper message");
        }
    }
}