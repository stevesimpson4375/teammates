package teammates.test.cases.common;

import java.util.Date;

import org.testng.annotations.Test;

import teammates.common.datatransfer.FeedbackResponseAttributes;
import teammates.common.util.Const;
import teammates.test.cases.BaseTestCase;

public class FeedbackResponseAttributesTest extends BaseTestCase {

    private class FeedbackResponseAttributesWithModifiableTimestamp extends FeedbackResponseAttributes {
        
        private void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }
        
        private void setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
        }
        
    }
    
    @Test
    public void testDefaultTimestamp() {
        FeedbackResponseAttributesWithModifiableTimestamp fra =
                new FeedbackResponseAttributesWithModifiableTimestamp();
        
        fra.setCreatedAt(null);
        fra.setUpdatedAt(null);
        
        Date defaultTimeStamp = Const.TIME_REPRESENTS_DEFAULT_TIMESTAMP;
        
        ______TS("success : defaultTimeStamp for createdAt date");
        
        assertEquals(defaultTimeStamp, fra.getCreatedAt());
        
        ______TS("success : defaultTimeStamp for updatedAt date");
        
        assertEquals(defaultTimeStamp, fra.getUpdatedAt());
    }
    
}
