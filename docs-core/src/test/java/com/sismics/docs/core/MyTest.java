package com.sismics.docs.core;

import com.sismics.docs.BaseTransactionalTest;
import com.sismics.docs.core.service.InboxService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the persistance layer.
 * 
 * @author jtremeaux
 */
public class MyTest extends BaseTransactionalTest {
    @Test
    public void myetst() throws Exception {
        InboxService inbox = new InboxService();        
        Assert.assertNotNull(inbox.testInbox());
    }
}
