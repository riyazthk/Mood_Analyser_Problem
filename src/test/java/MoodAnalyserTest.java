import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalyserSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is sad message");
           String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("sad", mood);
        }
    @Test
    public void testMoodAnalyserHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is happy message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("happy", mood);
    }
    }

