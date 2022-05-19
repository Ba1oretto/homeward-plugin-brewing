import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    void testReplaceAll() {
        String s = "[{level=1, item={id=first, display={name=[level 1], color=[255, 0, 255]}}}, {level=2, item={id=second, display={name=level 2, color=[148, 0, 211]}}}, {level=3, item={id=third, display={name=level 3, color=[0, 191, 255]}}}, {level=4, item={id=fourth, display={name=level 4, color=[124, 252, 0]}}}]";
        System.out.println(s.replaceAll("=([^{}\\[\\]]+?),", "=\"$1\","));
    }
}
