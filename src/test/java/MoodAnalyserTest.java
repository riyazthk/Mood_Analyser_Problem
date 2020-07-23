import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalyser() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("sad");
        String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("sad", mood);
        }
    @Test
    public void testMoodAnalyserHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("happy");
          String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("happy", mood);
        }

    @Test
    public void givenNullMoodShouldReturnNull() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
          String  mood = moodAnalyser.analyseMood();
            Assert.assertEquals("happy", mood);

    }
    }


