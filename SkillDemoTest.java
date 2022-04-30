import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest { 
    @Test
    public void combineTest() {    
    assertEquals("heyyou", SkillDemoClass.combineStrings("hey", "you"));
    }
}