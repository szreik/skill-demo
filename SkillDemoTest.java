import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest { 
    @Test
    public void combineTest() {    
    assertEquals("hey you", SkillDemoClass.combineStrings("hey", "you"));
    }
}