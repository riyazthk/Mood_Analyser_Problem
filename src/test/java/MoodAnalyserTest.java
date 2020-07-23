import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalyserSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
           String mood = moodAnalyser.analyseMood("This is sad message");
            Assert.assertEquals("sad", mood);
        }
    @Test
    public void testMoodAnalyserHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is happy message");
        Assert.assertEquals("happy", mood);
    }
    }

