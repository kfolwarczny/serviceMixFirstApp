package serviceMixFirstApp.impl;

import junit.framework.TestCase;
import serviceMixFirstApp.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}